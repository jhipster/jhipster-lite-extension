package tech.jhipster.lite.extension.generator.prettier.properties.domain;

import static tech.jhipster.lite.module.infrastructure.secondary.JHipsterModulesAssertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.jhipster.lite.TestFileUtils;
import tech.jhipster.lite.extension.UnitTest;
import tech.jhipster.lite.extension.shared.dependencies.infrastructure.secondary.JhliteExtensionSampleNpmVersionReader;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.JHipsterModulesFixture;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;
import tech.jhipster.lite.module.infrastructure.secondary.FileSystemProjectFiles;
import tech.jhipster.lite.module.infrastructure.secondary.TestJHipsterModules;

@UnitTest
class PrettierPluginsModuleFactoryTest {

  private final PrettierPluginsModuleFactory factory = new PrettierPluginsModuleFactory();

  @BeforeEach
  void setup() {
    TestJHipsterModules.register(new JhliteExtensionSampleNpmVersionReader(new FileSystemProjectFiles()));
  }

  @AfterEach
  void tearDown() {
    TestJHipsterModules.unregisterReaders();
  }

  @Test
  void shouldBuildPropertiesPluginModule() {
    JHipsterModuleProperties properties = JHipsterModulesFixture.propertiesBuilder(TestFileUtils.tmpDirForTest()).build();

    JHipsterModule module = factory.buildPropertiesPluginModule(properties);

    assertThatModuleWithFiles(module, packageJsonFile())
      .hasFile("package.json")
      .containing(
        """
        "prettier-plugin-properties": "\
        """
      );
  }

  public static ModuleFile packageJsonFile() {
    return file("src/test/resources/projects/empty-node/package.json", "package.json");
  }
}
