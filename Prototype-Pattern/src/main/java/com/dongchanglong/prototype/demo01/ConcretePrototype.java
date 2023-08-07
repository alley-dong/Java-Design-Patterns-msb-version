package com.dongchanglong.prototype.demo01;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 具体原型类
 *  实现Cloneable标识接口，表示当前类对象可复制
 *
 * 抽象原型类 - Cloneable
 *
 * ConcretePrototype和Address需要实现序列化，否则会抛NotSerializableException异常。
 */
@Getter
@Setter
public class ConcretePrototype implements Cloneable, Serializable {

    private String name;
    private Address address;

    public ConcretePrototype(){
        System.out.println("具体原型对象创建成功");
    }
    public ConcretePrototype(String name,Address address){
        this.name = name;
        this.address = address;
    }

    /**
     * 浅拷贝
     * @throws CloneNotSupportedException
     */
    @Override
    public ConcretePrototype clone() throws CloneNotSupportedException {
        System.out.println("克隆对象创建成功");
        return (ConcretePrototype) super.clone();
    }
}
