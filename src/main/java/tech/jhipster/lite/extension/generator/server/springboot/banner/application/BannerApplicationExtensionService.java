package tech.jhipster.lite.extension.generator.server.springboot.banner.application;

import org.springframework.stereotype.Service;
import tech.jhipster.lite.extension.generator.server.springboot.banner.domain.BannerModuleFactory;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

@Service
public class BannerApplicationExtensionService {

  private final BannerModuleFactory factory;

  public BannerApplicationExtensionService() {
    this.factory = new BannerModuleFactory();
  }

  public JHipsterModule buildJHipsterV7Banner(JHipsterModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV7(properties);
  }

  public JHipsterModule buildJHipsterV7ReactBanner(JHipsterModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV7React(properties);
  }

  public JHipsterModule buildJHipsterV7VueBanner(JHipsterModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV7Vue(properties);
  }

  public JHipsterModule buildJHipsterV2Banner(JHipsterModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV2(properties);
  }

  public JHipsterModule buildJHipsterV3Banner(JHipsterModuleProperties properties) {
    return factory.buildModuleBannerJHipsterV3(properties);
  }
}
