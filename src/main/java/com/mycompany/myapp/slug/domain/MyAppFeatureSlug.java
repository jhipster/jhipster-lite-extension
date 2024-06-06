package com.mycompany.myapp.slug.domain;

import tech.jhipster.lite.module.domain.resource.JHipsterFeatureSlugFactory;

public enum MyAppFeatureSlug implements JHipsterFeatureSlugFactory {
  BANNER("banner");

  private final String slug;

  MyAppFeatureSlug(String slug) {
    this.slug = slug;
  }

  @Override
  public String get() {
    return slug;
  }
}
