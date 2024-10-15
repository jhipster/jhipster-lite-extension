package tech.jhipster.lite.extension.generator.prettier.properties.domain;

import static tech.jhipster.lite.extension.shared.dependencies.domain.JhliteExtensionSampleNpmVersionSource.JHLITE_EXTENSION_SAMPLE;
import static tech.jhipster.lite.module.domain.JHipsterModule.*;

import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;

public class PrettierPluginsModuleFactory {

  public JHipsterModule buildPropertiesPluginModule(JHipsterModuleProperties properties) {
    //@formatter:off
    return moduleBuilder(properties)
      .packageJson()
        .addDevDependency(packageName("prettier-plugin-properties"), JHLITE_EXTENSION_SAMPLE)
        .and()
      .preCommitActions(stagedFilesFilter("*.properties"), preCommitCommands("prettier --write"))
      .build();
    //@formatter:on
  }
}
