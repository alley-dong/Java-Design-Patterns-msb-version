package com.dongchanglong.framework.beans;

import lombok.Data;

/**
 * 封装Bean标签数据的类,包括id与class以及子标签的数据
 *
 * @author DongCL
 * @date 2023/11/24 21:31
 */
@Data
public class BeanDefinition {
    private String id;
    private String className;
    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }
}