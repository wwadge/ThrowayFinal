package com.go.demo;


import com.go.demo.model.AccountHolder;
import com.go.demo.model.repository.factory.RepositoryFactoryBean;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

/**
 * Created by wwadge on 06/12/14.
 */
@EnableAutoConfiguration(exclude = RabbitAutoConfiguration.class)
@EnableConfigurationProperties
@ComponentScan
@EnableJpaRepositories(basePackageClasses = AccountHolder.class,
        repositoryFactoryBeanClass=RepositoryFactoryBean.class,
        repositoryImplementationPostfix = "CustomImpl")
@Configuration
public class ModelConfiguration {

    @Bean
    @ConfigurationProperties(prefix="demo.datasource")
    DataSource dataSource() {
        return new HikariDataSource();
    }
}
