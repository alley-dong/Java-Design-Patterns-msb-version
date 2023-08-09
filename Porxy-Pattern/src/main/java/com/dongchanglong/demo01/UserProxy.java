package com.dongchanglong.demo01;

/**
 * 代理类
 * @date 2023/8/8 14:45
 * @author DongCL
 */
public class UserProxy implements IUserDao{

    private IUserDao target;
    public UserProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        // 扩展额外的功能
        System.out.println("开启事物");
        target.save();
        System.out.println("提交事物");
    }

    @Override
    public void delete(Integer id) {
        // 扩展额外的功能
        System.out.println("开启事物");
        target.delete(1);
        System.out.println("提交事物");
    }
}
