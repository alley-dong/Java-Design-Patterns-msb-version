package com.dongchanglong.framework.beans.factory.support;

/**
 * 该类定义解析配置文件规则的接口（或者解析@Annotition注解的Bean）
 * @date 2023/11/24 22:29
 * @author DongCL
 */
public interface BeanDefinitionReader {

    //获取注册表对象
    BeanDefinitionRegistry getRegistry();

    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
