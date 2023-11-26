package com.dongchanglong.framework.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 该类用来封装Bean标签下的property子标签属性
 *      1.name属性
 *      2.ref属性
 *      3.value属性： 给基本数据类型或者String类型数据赋的值
 * @date 2023/11/24 21:14
 * @author DongCL
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyValue {
    private String name;
    private String ref;
    private String value;
}
