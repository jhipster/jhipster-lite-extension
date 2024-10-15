package tech.jhipster.lite.extension.generator.prettier.properties.primary;

import static tech.jhipster.lite.extension.shared.slug.domain.JhliteExtensionSampleModuleSlug.PRETTIER_PLUGIN_PROPERTIES;
import static tech.jhipster.lite.shared.slug.domain.JHLiteModuleSlug.PRETTIER;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.extension.generator.prettier.properties.application.PrettierPluginsApplicationService;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleOrganization;
import tech.jhipster.lite.module.domain.resource.JHipsterModulePropertiesDefinition;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleResource;

@Configuration
class PrettierPluginsModuleConfiguration {

  @Bean
  JHipsterModuleResource prettierPropertiesModule(PrettierPluginsApplicationService prettierPlugins) {
    return JHipsterModuleResource.builder()
      .slug(PRETTIER_PLUGIN_PROPERTIES)
      .propertiesDefinition(JHipsterModulePropertiesDefinition.EMPTY)
      .apiDoc("Prettier", "Format .properties files with prettier")
      .organization(JHipsterModuleOrganization.builder().addDependency(PRETTIER).build())
      .tags("prettier")
      .factory(prettierPlugins::buildPropertiesPluginModule);
  }
}
