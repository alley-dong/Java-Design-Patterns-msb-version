package com.dongchanglong.singleton.demo04;

/**
 * 单例模式-枚举
 *  特点：
 *      阻止反射的破坏：在反射方法中不允许使用反射创建枚举对象
 *      阻止序列化的破坏：在JVM中枚举是唯一的
 */
public enum Singleton_06 {

    INSTANCE;

    private Object data;

    /**
     * 提供外部调用
     */
    public static Singleton_06 getInstance(){
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
