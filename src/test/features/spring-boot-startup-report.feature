Feature: Prettier Plugins

  Scenario: Should apply properties plugin
    When I apply "spring-boot-startup-report" module to default project with maven file without parameters
    Then I should have "spring-boot-startup-report" in "pom.xml"
