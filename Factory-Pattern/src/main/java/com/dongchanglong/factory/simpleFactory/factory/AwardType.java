package com.dongchanglong.factory.simpleFactory.factory;

import com.dongchanglong.factory.simpleFactory.service.FactoryService;
import com.dongchanglong.factory.simpleFactory.service.impl.DiscountServiceImpl;
import com.dongchanglong.factory.simpleFactory.service.impl.SmallGiftServiceImpl;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum AwardType {

    DISCOUNT("1",DiscountServiceImpl::new),
    SMALL("2",SmallGiftServiceImpl::new);

    private final String key;
    /**
     * 提供外部获取 实现类  getter
     */
    private final Supplier<FactoryService> constructor;

    /**
     * 返回整个枚举对象
     */
    public static AwardType getEnum(String code) {
        for (AwardType awardType : AwardType.values()) {
            if (awardType.getKey().equals(code)) {
                return awardType;
            }
        }
        return null;
    }
}
