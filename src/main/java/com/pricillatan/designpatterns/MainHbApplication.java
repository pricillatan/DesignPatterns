package com.pricillatan.designpatterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.pricillatan")
@EnableScheduling
public class MainHbApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainHbApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MainHbApplication.class, args);
        
    }
}
