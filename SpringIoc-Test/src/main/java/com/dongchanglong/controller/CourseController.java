package com.dongchanglong.controller;

import com.dongchanglong.framework.context.support.ClassPathXmlApplicationContext;
import com.dongchanglong.service.CourseService;

public class CourseController{

    public static void main(String[] args) throws Exception {
        //1.创建Spring的容器对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器对象中获取CourseService对象
        CourseService courseService = context.getBean("courseService", CourseService.class);
        //3.调用UserService的add方法
        courseService.add();
    }
}