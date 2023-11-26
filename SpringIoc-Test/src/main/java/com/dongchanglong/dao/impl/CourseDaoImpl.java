package com.dongchanglong.dao.impl;

import com.dongchanglong.dao.CourseDao;

public class CourseDaoImpl implements CourseDao {
    //value注入
    private String courseName;
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public CourseDaoImpl() {
        System.out.println("CourseDaoImpl创建了......");
    }

    @Override
    public void add() {
        System.out.println("CourseDaoImpl的add方法执行了......" + courseName);
    }
}
