package com.tensquare.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author: Luck-zb
 * description：来测试一下FactoryBean
 * Date：2021/2/24 - 17:18
 */
@SpringBootApplication
public class TestApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(TestApplication.class, args);


        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        for (PropertySource<?> propertySource : propertySources) {
            System.out.println(propertySource);
        }
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
}
