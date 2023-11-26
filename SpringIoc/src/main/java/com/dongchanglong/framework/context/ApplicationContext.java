package com.dongchanglong.framework.context;

import com.dongchanglong.framework.beans.factory.BeanFactory;

/**
 * 定义非延时加载功能
 * @date 2023/11/26 11:29
 * @author DongCL
 */
public interface ApplicationContext extends BeanFactory {
    //进行配置文件加载,并进行对象创建
    void refresh();
}
