package tech.jhipster.lite.extension.generator.server.springboot.startupreport.infrastructure.primary;

import static tech.jhipster.lite.extension.shared.slug.domain.JhliteExtensionSampleModuleSlug.*;
import static tech.jhipster.lite.generator.slug.domain.JHLiteModuleSlug.SPRING_BOOT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.extension.generator.server.springboot.startupreport.application.StarterReportApplicationService;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleOrganization;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleResource;

@Configuration
class StarterReportModuleConfiguration {

  @Bean
  JHipsterModuleResource jhipsterV7BannerResource(StarterReportApplicationService banners) {
    return JHipsterModuleResource.builder()
      .slug(SPRING_BOOT_STARTUP_REPORT)
      .withoutProperties()
      .apiDoc(
        "Spring Boot",
        "Generates an interactive Spring Boot application startup report that lets you understand what contributes to the application startup time and perhaps helps to optimize it"
      )
      .organization(JHipsterModuleOrganization.builder().addDependency(SPRING_BOOT).build())
      .tags("server", "spring", "spring-boot")
      .factory(banners::buildModule);
  }
}
