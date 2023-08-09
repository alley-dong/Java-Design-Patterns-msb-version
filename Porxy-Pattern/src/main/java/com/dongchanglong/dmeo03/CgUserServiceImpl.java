package com.dongchanglong.dmeo03;

import java.util.Collections;
import java.util.List;

/**
 * 目标类(父类)
 * @date 2023/8/9 15:41
 * @author DongCL
 */
public class CgUserServiceImpl {
    // 查询功能
    public List<User> userList(){
        return Collections.singletonList(new User("dongchanglong",24));
    }
}
