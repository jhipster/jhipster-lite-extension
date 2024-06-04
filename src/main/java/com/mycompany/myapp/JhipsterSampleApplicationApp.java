package com.mycompany.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.jhipster.lite.JHLiteApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import com.mycompany.myapp.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

@SpringBootApplication(scanBasePackageClasses = { JHLiteApp.class, JhipsterSampleApplicationApp.class })
@ExcludeFromGeneratedCodeCoverage(reason = "Not testing logs")
public class JhipsterSampleApplicationApp {

  private static final Logger log = LoggerFactory.getLogger(JhipsterSampleApplicationApp.class);

  public static void main(String[] args) {
    Environment env = SpringApplication.run(JhipsterSampleApplicationApp.class, args).getEnvironment();

    if (log.isInfoEnabled()) {
      log.info(ApplicationStartupTraces.of(env));
    }
  }
}
