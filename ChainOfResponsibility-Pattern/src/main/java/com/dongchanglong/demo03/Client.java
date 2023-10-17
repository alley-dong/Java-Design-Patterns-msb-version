package com.dongchanglong.demo03;

import com.alibaba.fastjson.JSON;
import com.dongchanglong.demo02.AuthService;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    protected Logger logger = LoggerFactory.getLogger(Client.class);

    @Test
    public void test_AuthLink() throws ParseException {

        AuthLink authLink = new LevelThreeAuthLink("1000013", "王工")
                .appendNext(new LevelTwoAuthLink("1000012", "张经理")
                        .appendNext(new LevelOneAuthLink("1000011", "段总")));

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = f.parse("2023-11-18 23:49:46");

        logger.debug("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟三级负责人审批
        AuthService.auth("1000013", "1000998004813441");
        logger.debug("测试结果：{}", "模拟三级负责人审批，王工");
        logger.debug("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟二级负责人审批
        AuthService.auth("1000012", "1000998004813441");
        logger.debug("测试结果：{}", "模拟二级负责人审批，张经理");
        logger.debug("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟一级负责人审批
        AuthService.auth("1000011", "1000998004813441");
        logger.debug("测试结果：{}", "模拟一级负责人审批，段总");
        logger.debug("测试结果：{}", JSON.toJSONString(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));
    }
}
