package tech.jhipster.lite.extension;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import tech.jhipster.lite.JHLiteApp;
import tech.jhipster.lite.extension.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

@SpringBootApplication(scanBasePackageClasses = { JHLiteApp.class, JhliteExtensionSampleApp.class })
@ExcludeFromGeneratedCodeCoverage(reason = "Not testing logs")
public class JhliteExtensionSampleApp {

  private static final Logger log = LoggerFactory.getLogger(JhliteExtensionSampleApp.class);

  public static void main(String[] args) {
    Environment env = SpringApplication.run(JhliteExtensionSampleApp.class, args).getEnvironment();

    if (log.isInfoEnabled()) {
      log.info(ApplicationStartupTraces.of(env));
    }
  }
}
