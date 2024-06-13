package com.mycompany.myapp.shared.slug.domain;

import tech.jhipster.lite.module.domain.resource.JHipsterFeatureSlugFactory;

public enum JHLiteSampleExtensionFeatureSlug implements JHipsterFeatureSlugFactory {
  BANNER("banner");

  private final String slug;

  JHLiteSampleExtensionFeatureSlug(String slug) {
    this.slug = slug;
  }

  @Override
  public String get() {
    return slug;
  }
}
