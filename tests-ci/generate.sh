#!/usr/bin/env bash

show_syntax() {
  echo "Usage: $0 <application> <java-build-tool> <spring-configuration-format>" >&2
  exit 1
}

if [ "$#" -ne 3 ]; then
  show_syntax
fi

if test -f "modulePayload.json"; then
  payloadFile="modulePayload.json"
elif test -f tests-ci/modulePayload.json; then
  payloadFile=tests-ci/modulePayload.json
fi

application=$1
java_build_tool=$2
configuration_format=$3

applyModules() {
  for module in $@
  do
    local payload="$(sed -e "s/APP_NAME/$application/g;s/SPRING_CONFIG_FORMAT/$configuration_format/g" $payloadFile)"
    local api="/api/modules/$module/apply-patch"

    echo "curl -o /dev/null -s -w "%{http_code}\n" \
      -X POST \
      -H "accept: */*" \
      -H "Content-Type: application/json" \
      -d "$payload" \
      "http://localhost:7471""$api""

    local status_code=$(curl -o /dev/null -s -w "%{http_code}\n" \
      -X POST \
      -H "accept: */*" \
      -H "Content-Type: application/json" \
      -d "$payload" \
      "http://localhost:7471""$api")

    if [[ $status_code == '40'* || $status_code == '50'* ]]; then
      echo "Error when calling API:" "$status_code" "$api"
      exit 1
    fi;
  done
}

init_server() {
  applyModules \
  "init" \
  "${java_build_tool}-wrapper" \
  "${java_build_tool}-java"
}

if [[ $application == 'fullapp' ]]; then
  init_server
  # apply here your custom modules

else
  echo "*** Unknown configuration..."
  exit 1
fi

echo ""
cat "$payloadFile"
echo ""
sleep 5
