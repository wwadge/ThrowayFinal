package com.go.demo.core;

import com.go.demo.ModelConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.integration.config.EnableIntegration;

/**
 * Created by wwadge on 15/01/15.
 */

@Configuration
@ComponentScan
@EnableIntegration
@EnableAutoConfiguration
@Import(value = {ModelConfiguration.class})
@Slf4j
public class CoreApplication {

    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(CoreApplication.class, args);
    }
}
