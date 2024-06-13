package com.mycompany.myapp.shared.slug.domain;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleSlugFactory;

public enum JHLiteSampleExtensionModuleSlug implements JHipsterModuleSlugFactory {
  BANNER_JHIPSTER_V2("banner-jhipster-v2-extension"),
  BANNER_JHIPSTER_V3("banner-jhipster-v3-extension"),
  BANNER_JHIPSTER_V7("banner-jhipster-v7-extension"),
  BANNER_JHIPSTER_V7_REACT("banner-jhipster-v7-react-extension"),
  BANNER_JHIPSTER_V7_VUE("banner-jhipster-v7-vue-extension");

  private static final Map<String, JHLiteSampleExtensionModuleSlug> moduleSlugMap = Stream.of(values()).collect(
    Collectors.toMap(JHLiteSampleExtensionModuleSlug::get, Function.identity())
  );
  private final String slug;

  JHLiteSampleExtensionModuleSlug(String slug) {
    this.slug = slug;
  }

  @Override
  public String get() {
    return slug;
  }

  public static Optional<JHLiteSampleExtensionModuleSlug> fromString(String slug) {
    return Optional.ofNullable(moduleSlugMap.get(slug));
  }
}
