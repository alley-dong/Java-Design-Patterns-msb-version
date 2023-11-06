package com.dongchanglong.demo01;

/**
 * 负责人-保存备忘录对象
 * @date 2023/11/6 20:45
 * @author DongCL
 */
public class Caretaker {
    private Memento memento;
    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}