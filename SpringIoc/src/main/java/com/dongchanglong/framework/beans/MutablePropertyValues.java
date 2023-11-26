package com.dongchanglong.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 该类用来存储和遍历多个PropertyValue对象
 * @date 2023/11/24 21:19
 * @author DongCL
 */
public class MutablePropertyValues implements Iterable<PropertyValue>{

    //定义List集合,存储PropertyValue的容器
    private final List<PropertyValue> propertyValueList;

    //空参构造中 初始化一个list
    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<>();
    }

    //有参构造 接收一个外部传入的list,赋值propertyValueList属性
    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList == null){
            this.propertyValueList = new ArrayList<>();
        }else {
            this.propertyValueList = propertyValueList;
        }
    }

    // 获取当前容器对应的迭代器对象
    @Override
    public Iterator<PropertyValue> iterator() {
        // 获取List集合对应的迭代器
        return propertyValueList.iterator();
    }

    //获取所有的PropertyValue
    public PropertyValue[] getPropertyValues(){
        //将集合转换为数组并返回
        //new PropertyValue[0]声明返回的数组类型
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    //根据name属性值获取PropertyValue
    public PropertyValue getPropertyValue(String propertyName){
        //遍历集合对象
        for (PropertyValue propertyValue : propertyValueList) {
            if(propertyValue.getName().equals(propertyName)){
                return propertyValue;
            }
        }
        return null;
    }

    //判断集合是否为空,是否存储PropertyValue
    public boolean isEmpty(){
        return propertyValueList.isEmpty();
    }

    //向集合中添加
    public MutablePropertyValues addPropertyValue(PropertyValue value){
        //判断集合中存储的propertyvalue对象.是否重复,重复就进行覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            //获取集合中每一个 PropertyValue
            PropertyValue currentPv = propertyValueList.get(i);

            //判断当前的pv的name属性 是否与传入的相同,如果相同就覆盖
            if(currentPv.getName().equals(value.getName())){
                propertyValueList.set(i,value);
                return this;
            }
        }
        //没有重复
        this.propertyValueList.add(value);
        return this;  //目的是实现链式编程
    }

    //判断是否有指定name属性值的对象
    public boolean contains(String propertyName){
        return getPropertyValue(propertyName) != null;
    }
}
