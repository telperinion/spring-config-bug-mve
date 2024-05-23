package com.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class PropertyLogger {

    private static final Logger log = Logger.getLogger(PropertyLogger.class.getName());


    @Value("${test}")
    private String test;

    @PostConstruct
    public void logTest() {
        log.info(test);
    }

}
