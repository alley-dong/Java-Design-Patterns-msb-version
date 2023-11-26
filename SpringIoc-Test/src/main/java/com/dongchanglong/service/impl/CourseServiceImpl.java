package com.dongchanglong.service.impl;

import com.dongchanglong.dao.CourseDao;
import com.dongchanglong.service.CourseService;

public class CourseServiceImpl implements CourseService {

    public CourseServiceImpl() {
        System.out.println("CourseServiceImpl创建了......");
    }

    private CourseDao courseDao;

    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void add() {
        System.out.println("CourseServiceImpl的add方法执行了......");
        courseDao.add();
    }
}