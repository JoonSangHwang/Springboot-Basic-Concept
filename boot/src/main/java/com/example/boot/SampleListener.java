package com.example.boot;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {

    /**
     * ApplicationStartingEvent 이벤트는 ApplicationContext 가 만들어지기 전에 발생하는 이벤트로 Bean 으로 등록을 해도 동작을 안한다.
     * 그러므로 @Component 어노테이션도 그냥 붙히지 않는다.
     * 그리고 실행을 위해 SpringApplication Run 과 함께 쓴다.
     */

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("===================");
        System.out.println("Application Starting");
        System.out.println("===================");
    }
}
