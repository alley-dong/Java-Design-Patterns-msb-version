package com.dongchanglong.framework.context.support;

import com.dongchanglong.framework.beans.factory.support.BeanDefinitionReader;
import com.dongchanglong.framework.beans.factory.support.BeanDefinitionRegistry;
import com.dongchanglong.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * ApplicationContext接口的子类实现类
 *     创建容器对象时 加载配置文件，对bean进行初始化
 *   *** 类实现了接口 如果不想重写所有接口 那么需要将类变为抽象类。
 * @date 2023/11/26 11:31
 * @author DongCL
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    //声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    //定义存储bean对象的Map集合
    protected Map<String,Object> singletonObjects = new HashMap<>();

    //声明配置文件类路径的变量
    protected String configLocation;

    @Override
    public void refresh() {
        //加载beanDefinition对象
        try {
            beanDefinitionReader.loadBeanDefinitions(configLocation);
            //初始化bean
            finishBeanInitialization();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //bean初始化
    protected  void finishBeanInitialization() throws Exception {
        //获取对应的注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();

        //获取beanDefinition对象
        String[] beanNames = registry.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            //进行bean的初始化
            getBean(beanName);
        }
    }
}
