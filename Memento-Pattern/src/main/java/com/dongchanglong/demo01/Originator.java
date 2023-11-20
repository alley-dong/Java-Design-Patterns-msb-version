package com.dongchanglong.demo01;

import lombok.Data;

/**
 * 发起人
 * @date 2023/11/6 20:44
 * @author DongCL
 */
@Data
public class Originator {

    private String state = "原始对象";
    private String id;
    private String name;
    private String phone;

    public Originator() {
    }

    //创建备忘录对象
    public Memento create(){
        return new Memento(id,name,phone);
    }

    //恢复对象状态
    public void restore(Memento m){
        this.state = m.getState();
        this.id = m.getId();
        this.name = m.getName();
        this.phone = m.getPhone();
    }
}