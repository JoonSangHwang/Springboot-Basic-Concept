package com.example.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ValueUse implements ApplicationListener<ApplicationStartedEvent> {

    @Value("${junsang.name}")
    private String testName;

    @Autowired
    Environment environment;

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("===================");
        System.out.println("Application Started");
        System.out.println("aa : " + testName);
        System.out.println("aa : " + environment.getProperty("junsang.name"));
        System.out.println("===================");
    }
}
