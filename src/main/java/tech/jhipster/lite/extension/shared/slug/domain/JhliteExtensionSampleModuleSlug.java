package tech.jhipster.lite.extension.shared.slug.domain;

import tech.jhipster.lite.module.domain.resource.JHipsterModuleSlugFactory;

public enum JhliteExtensionSampleModuleSlug implements JHipsterModuleSlugFactory {
  BANNER_JHIPSTER_V2("banner-jhipster-v2"),
  BANNER_JHIPSTER_V3("banner-jhipster-v3"),
  BANNER_JHIPSTER_V7("banner-jhipster-v7"),
  BANNER_JHIPSTER_V7_REACT("banner-jhipster-v7-react"),
  BANNER_JHIPSTER_V7_VUE("banner-jhipster-v7-vue");

  private final String slug;

  JhliteExtensionSampleModuleSlug(String slug) {
    this.slug = slug;
  }

  @Override
  public String get() {
    return slug;
  }
}
