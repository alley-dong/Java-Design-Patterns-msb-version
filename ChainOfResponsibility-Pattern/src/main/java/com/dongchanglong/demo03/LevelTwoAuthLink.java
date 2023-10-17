package com.dongchanglong.demo03;

import com.dongchanglong.demo02.AuthInfo;
import com.dongchanglong.demo02.AuthService;

import java.text.ParseException;
import java.util.Date;

public class LevelTwoAuthLink extends AuthLink{

    private Date beginDate = sdf.parse("2023-11-11 00:00:00");
    private Date endDate = sdf.parse("2023-11-31 00:00:00");

    public LevelTwoAuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date){
            return new AuthInfo("0001","单号：" + orderId + "状态：待二级审核人审批",levelUserName);
        }
        AuthLink next = super.getNext();
        if (next == null){
            return new AuthInfo("0001","单号：" + orderId + "状态：二级审核完成，审批人：",levelUserName);
        }
        if (authDate.before(beginDate) || authDate.after(endDate)){
            return new AuthInfo("0001","单号：" + orderId + "状态：二级审核完成，审批人：",levelUserName);
        }
        return next.doAuth(uId,orderId,authDate);
    }
}
