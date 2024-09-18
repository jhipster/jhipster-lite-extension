package tech.jhipster.lite.extension.shared.dependencies.domain;

import tech.jhipster.lite.module.domain.npm.NpmVersionSource;
import tech.jhipster.lite.module.domain.npm.NpmVersionSourceFactory;

public enum JhliteExtensionSampleNpmVersionSource implements NpmVersionSourceFactory {
  JHLITE_EXTENSION_SAMPLE("jhlite-extension-sample");

  private final String source;

  JhliteExtensionSampleNpmVersionSource(String source) {
    this.source = source;
  }

  @Override
  public NpmVersionSource build() {
    return new NpmVersionSource(source);
  }
}
