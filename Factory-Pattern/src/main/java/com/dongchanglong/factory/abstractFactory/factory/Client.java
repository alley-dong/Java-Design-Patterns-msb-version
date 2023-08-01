package com.dongchanglong.factory.abstractFactory.factory;

import com.dongchanglong.factory.abstractFactory.product.AbstractFreezer;
import com.dongchanglong.factory.abstractFactory.product.AbstractTV;
import lombok.Data;

/**
 * 客户端
 */
@Data
public class Client {

    private AbstractTV abstractTV;
    private AbstractFreezer abstractFreezer;

    /**
     * 工厂的工厂
     */
    public static class FactoryMaker {
        /**
         * Enumeration for the different types of 产品.
         */
        public enum ProductType {
            HAIR, HISENSE
        }
        /**
         * The factory method to create 抽象工厂 concrete objects.
         * 代码报错的话 把Language leven改成jdk16
         */
        public static AppliancesFactory makeFactory(ProductType type) {
            return switch (type) {
                case HAIR -> new HairFactory();
                case HISENSE -> new HisenseFactory();
                default -> throw new IllegalArgumentException("KingdomType not supported.");
            };
        }
    }
}
