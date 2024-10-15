package tech.jhipster.lite.extension.generator.server.springboot.startupreport.domain;

import static tech.jhipster.lite.module.infrastructure.secondary.JHipsterModulesAssertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.jhipster.lite.TestFileUtils;
import tech.jhipster.lite.extension.UnitTest;
import tech.jhipster.lite.extension.shared.dependencies.infrastructure.secondary.JhliteExtensionSampleMavenDependenciesReader;
import tech.jhipster.lite.module.domain.JHipsterModule;
import tech.jhipster.lite.module.domain.JHipsterModulesFixture;
import tech.jhipster.lite.module.domain.properties.JHipsterModuleProperties;
import tech.jhipster.lite.module.infrastructure.secondary.FileSystemProjectFiles;
import tech.jhipster.lite.module.infrastructure.secondary.JHipsterModulesAssertions;
import tech.jhipster.lite.module.infrastructure.secondary.TestJHipsterModules;

@UnitTest
class SpringBootStartupReportModuleFactoryTest {

  private final SpringBootStartupReportModuleFactory factory = new SpringBootStartupReportModuleFactory();

  @BeforeEach
  void setup() {
    TestJHipsterModules.register(new JhliteExtensionSampleMavenDependenciesReader(new FileSystemProjectFiles()));
  }

  @AfterEach
  void tearDown() {
    TestJHipsterModules.unregisterReaders();
  }

  @Test
  void shouldBuildPropertiesPluginModule() {
    JHipsterModuleProperties properties = JHipsterModulesFixture.propertiesBuilder(TestFileUtils.tmpDirForTest()).build();

    JHipsterModule module = factory.buildModule(properties);

    assertThatModuleWithFiles(module, pomFile()).hasFile("pom.xml").containing("spring-boot-startup-report");
  }

  public static JHipsterModulesAssertions.ModuleFile pomFile() {
    return file("src/test/resources/projects/init-maven/pom.xml", "pom.xml");
  }
}
