package tech.jhipster.lite.extension.generator.server.springboot.startupreport.application;

import org.springframework.stereotype.Service;
import tech.jhipster.lite.extension.generator.server.springboot.startupreport.domain.StarterReportModuleFactory;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

@Service
public class StarterReportApplicationService {

  private final StarterReportModuleFactory factory;

  public StarterReportApplicationService() {
    this.factory = new StarterReportModuleFactory();
  }

  public JHipsterModule buildModule(JHipsterModuleProperties properties) {
    return factory.buildModule(properties);
  }
}
