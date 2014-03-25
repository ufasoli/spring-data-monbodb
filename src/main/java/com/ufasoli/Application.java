package com.ufasoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 24.03.2014
 * Time: 15:49
 */
// spring standard component scan
// spring boot autoconfiguration will bootstrap your Spring
//application while attempting to configure the beans you need
// it will also bootstrap an in-memory database if a driver is found
// in the classpath and no datasource is defined
@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
