package tech.jhipster.lite.extension.shared.slug.domain;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tech.jhipster.lite.extension.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleSlugFactory;

@ExcludeFromGeneratedCodeCoverage
public enum JhliteExtensionSampleModuleSlug implements JHipsterModuleSlugFactory {
  BANNER_JHIPSTER_V2("banner-jhipster-v2"),
  BANNER_JHIPSTER_V3("banner-jhipster-v3"),
  BANNER_JHIPSTER_V7("banner-jhipster-v7"),
  BANNER_JHIPSTER_V7_REACT("banner-jhipster-v7-react"),
  BANNER_JHIPSTER_V7_VUE("banner-jhipster-v7-vue"),
  PRETTIER_PLUGIN_PROPERTIES("prettier-plugin-properties"),
  SPRING_BOOT_STARTUP_REPORT("spring-boot-startup-report");

  private static final Map<String, JhliteExtensionSampleModuleSlug> moduleSlugMap = Stream.of(values()).collect(
    Collectors.toMap(JhliteExtensionSampleModuleSlug::get, Function.identity())
  );
  private final String slug;

  @SuppressWarnings("java:S1144")
  JhliteExtensionSampleModuleSlug(String slug) {
    this.slug = slug;
  }

  @Override
  public String get() {
    return slug;
  }

  public static Optional<JhliteExtensionSampleModuleSlug> fromString(String slug) {
    return Optional.ofNullable(moduleSlugMap.get(slug));
  }
}
