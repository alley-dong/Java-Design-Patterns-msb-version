package com.dongchanglong.framework.utils;

public class StringUtils {
    public static String getSetterMethodFieldName(String fieldName){
        // fieldName = courseDao
        return "set" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
    }
}
