package com.dongchanglong.framework.context.support;

import com.dongchanglong.framework.beans.BeanDefinition;
import com.dongchanglong.framework.beans.MutablePropertyValues;
import com.dongchanglong.framework.beans.PropertyValue;
import com.dongchanglong.framework.beans.factory.support.BeanDefinitionRegistry;
import com.dongchanglong.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.dongchanglong.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * IOC容器具体的子实现类,加载XML格式配置文件
 * @date 2023/11/26 11:55 
 * @author DongCL
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

    public ClassPathXmlApplicationContext(String configLocation) {
        // 将路径信息赋值给父类
        this.configLocation = configLocation;
        //构建解析器对象
        this.beanDefinitionReader = new XmlBeanDefinitionReader();
        // 让父类进行XML解析
        this.refresh();
    }

    @Override
    public Object getBean(String name) throws Exception {
        //判断对象容器中是否包含指定名称的bean对象,如果包含就返回,否则自行创建
        Object obj = singletonObjects.get(name);
        if (obj != null) {
            return obj;
        }
        //自行创建,获取beanDefinition对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);

        //通过反射创建对象
        String className = beanDefinition.getClassName();
        Class<?> clazz = Class.forName(className);
        Object beanObj = clazz.newInstance();

        //CourseService与UserDao存依赖,所以要将UserDao一同初始化,进行依赖注入
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            //获取name属性值
            String propertyName = propertyValue.getName();
            //获取Value属性
            String value = propertyValue.getValue();
            //获取ref属性
            String ref = propertyValue.getRef();

            //ref与value只能存在一个
            if(ref != null && !"".equals(ref)){
                //获取依赖的bean对象,拼接set set+Course
                Object bean = getBean(ref);
                String methodName = StringUtils.getSetterMethodFieldName(propertyName);

                //获取所有方法对象
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if(methodName.equals(method.getName())){
                        //执行该set方法
                        method.invoke(beanObj,bean);
                    }
                }
            }

            if(value != null && !"".equals(value)){
                String methodName = StringUtils.getSetterMethodFieldName(propertyName);
                //获取method
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(beanObj,value);
            }
        }
        //在返回beanObj之前 ,需要将对象存储到Map容器中
        this.singletonObjects.put(name,beanObj);
        return beanObj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if(bean == null){
            return null;
        }
        return clazz.cast(bean);
    }
}
