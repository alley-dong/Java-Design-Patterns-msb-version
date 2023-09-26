package com.dongchanglong.demo02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 回执信息
 * @date 2023/9/26 14:45
 * @author DongCL
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receipt {
    private String message;
    private String type;
}
