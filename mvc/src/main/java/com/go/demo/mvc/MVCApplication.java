package com.go.demo.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.config.EnableIntegration;

/**
 * Created by wwadge on 15/01/15.
 */
@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties
@EnableIntegration
@ComponentScan
public class MVCApplication  {

    public static void main(final String[] args) {
        SpringApplication.run(MVCApplication.class, args);
    }

}
