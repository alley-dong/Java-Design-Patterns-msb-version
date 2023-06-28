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

    DISCOUNT(DiscountServiceImpl::new),
    SMALL(SmallGiftServiceImpl::new);

    /**
     * 提供外部获取 实现类  getter
     */
    private final Supplier<FactoryService> constructor;
}
