package com.ivoslabs.spring.cloud.config.cli.web.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.ivoslabs.spring.cloud.config.cli.web.CloudPropertyPlaceholderConfigurer;

/**
 * @since 1.0.0
 * @author www.ivoslabs.com
 *
 */
@Configuration
public class Configurator {

    @Bean
    public CloudPropertyPlaceholderConfigurer getPropertyConfigurer(Environment environment) {
        CloudPropertyPlaceholderConfigurer conf = new CloudPropertyPlaceholderConfigurer();
        conf.setEnvironment(environment);
        return conf;
    }
}
