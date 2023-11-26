package com.dongchanglong.framework.beans.factory.support;

import com.dongchanglong.framework.beans.BeanDefinition;

/**
 * Bean的注册中心
 * @date 2023/11/24 21:39
 * @author DongCL
 */
public interface BeanDefinitionRegistry {

    //注册BeanDefinition对象到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    //从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName) throws Exception;

    //根据名称从注册表中获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    //判断注册表中是否包含指定名称的BeanDefinition对象
    boolean containsBeanDefinition(String beanName);

    //获取注册表中BeanDefinition对象的个数
    int getBeanDefinitionCount();

    //获取注册表中所有的BeanDefinition的名称
    String[] getBeanDefinitionNames();
}