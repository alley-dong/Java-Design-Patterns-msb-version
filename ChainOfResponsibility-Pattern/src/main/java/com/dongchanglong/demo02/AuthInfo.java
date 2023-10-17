package com.dongchanglong.demo02;

import lombok.Data;
import lombok.ToString;

/**
 * 审核信息
 */
@Data
@ToString
public class AuthInfo {
    private String code;
    private String info = "";
    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String str : infos) {
            info = this.info.concat(str +" ");
        }
    }
}