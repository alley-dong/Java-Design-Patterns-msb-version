package com.dongchanglong.demo01;

/**
 * 抽象主题类：声明了真实主题和代替主题的共同接口
 * @date 2023/8/8 10:19
 * @author DongCL
 */
public interface IUserDao {
    void save();
    void delete(Integer id);
}
