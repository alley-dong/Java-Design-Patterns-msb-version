package com.dongchanglong.framework.beans.factory.xml;

import com.dongchanglong.framework.beans.BeanDefinition;
import com.dongchanglong.framework.beans.MutablePropertyValues;
import com.dongchanglong.framework.beans.PropertyValue;
import com.dongchanglong.framework.beans.factory.support.BeanDefinitionReader;
import com.dongchanglong.framework.beans.factory.support.BeanDefinitionRegistry;
import com.dongchanglong.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * 该类是对XML文件进行解析的类
 * @date 2023/11/24 22:32
 * @author DongCL
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    // 声明注册表对象
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        // 注册表的实现类
        registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        // 使用Dom4j解析XML
        SAXReader saxReader = new SAXReader();
        // 获取指向配置文件的输入流
        InputStream resourceAsStream = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        // 文档对象
        Document read = saxReader.read(resourceAsStream);
        // 获取根标签
        Element rootElement = read.getRootElement();
        // 解析bean标签
        parseBean(rootElement);
    }

    private void parseBean(Element rootElement) {
        // 获取所有的bean标签
        List<Element> elements = rootElement.elements();
        // 遍历每个bean标签  获取id className属性以及property子标签
        for (Element element : elements) {
            String id = element.attributeValue("id");
            String className = element.attributeValue("class");

            // 封装数据到BeanDefinition
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            //获取property
            List<Element> elementList = element.elements("property");

            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
            for (Element property : elementList) {
                String name = property.attributeValue("name");
                String ref = property.attributeValue("ref");
                String value = property.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);

                // 将mutablePropertyValues封装到beanDefinition
                // 链式add
                mutablePropertyValues.addPropertyValue(propertyValue);
                //将mutablePropertyValues封装到beanDefinition
                beanDefinition.setPropertyValues(mutablePropertyValues);
                //将beanDefinition注册到注册表
                registry.registerBeanDefinition(id,beanDefinition);
            }
        }
    }


    public static void main(String[] args) throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader();
        xmlBeanDefinitionReader.loadBeanDefinitions("bean.xml");
    }
}
