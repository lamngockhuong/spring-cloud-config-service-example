package com.ngockhuong.configserviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServiceExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceExampleApplication.class, args);
    }
}
