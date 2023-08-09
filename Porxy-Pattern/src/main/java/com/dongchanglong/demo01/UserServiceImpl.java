package com.dongchanglong.demo01;

/**
 * 目标类
 *
 * @author DongCL
 * @date 14:30
 */
public class UserServiceImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存数据");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("删除数据");
    }
}
