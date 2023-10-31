package com.dongchanglong.demo02;

import lombok.Data;

/**
 * 主题类
 * @date 2023/10/31 21:39
 * @author DongCL
 */
@Data
public class Topic {
    private String name;
    public Topic(String name) {
        this.name = name;
    }
}
