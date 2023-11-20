package com.dongchanglong.even;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventTest {
    public static void main(String[] args) {
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.dongchanglong.even");
        Request request = (Request)annotationConfigApplicationContext.getBean("request");
        request.doRequest();
    }
}
