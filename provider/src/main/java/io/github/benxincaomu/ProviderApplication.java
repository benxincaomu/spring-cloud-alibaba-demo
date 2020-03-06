package io.github.benxincaomu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {
    private static Logger log=LoggerFactory.getLogger(ProviderApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ProviderApplication.class);
        log.info(run.getEnvironment().getProperty("name"));
        log.info(run.getEnvironment().getProperty("age"));
    }
}
