package com.dongchanglong.factory.demo02.factory;

import com.dongchanglong.factory.demo02.service.FactoryService;
import com.dongchanglong.factory.demo02.service.impl.DiscountServiceImpl;
import com.dongchanglong.factory.demo02.service.impl.SmallGiftServiceImpl;
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
