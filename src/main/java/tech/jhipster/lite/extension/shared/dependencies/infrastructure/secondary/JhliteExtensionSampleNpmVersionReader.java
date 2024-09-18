package tech.jhipster.lite.extension.shared.dependencies.infrastructure.secondary;

import java.util.List;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;
import tech.jhipster.lite.extension.shared.dependencies.domain.JhliteExtensionSampleNpmVersionSource;
import tech.jhipster.lite.module.domain.ProjectFiles;
import tech.jhipster.lite.module.domain.npm.NpmPackagesVersions;
import tech.jhipster.lite.module.infrastructure.secondary.npm.FileSystemNpmVersionReader;
import tech.jhipster.lite.module.infrastructure.secondary.npm.NpmVersionsReader;

@Repository
@Order(Ordered.HIGHEST_PRECEDENCE)
public class JhliteExtensionSampleNpmVersionReader implements NpmVersionsReader {

  private static final String PARENT_FOLDER = "/generator/jhlite-extension-sample-dependencies/";

  private final FileSystemNpmVersionReader reader;

  public JhliteExtensionSampleNpmVersionReader(ProjectFiles projectFiles) {
    reader = new FileSystemNpmVersionReader(projectFiles, List.of(JhliteExtensionSampleNpmVersionSource.values()), PARENT_FOLDER);
  }

  @Override
  public NpmPackagesVersions get() {
    return reader.get();
  }
}
