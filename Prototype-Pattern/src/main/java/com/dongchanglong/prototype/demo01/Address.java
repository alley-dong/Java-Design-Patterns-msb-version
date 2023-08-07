package com.dongchanglong.prototype.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 引用类型
 * @date 2023/8/2 18:47
 * @author DongCL
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Cloneable, Serializable {
    private String phone;
}
