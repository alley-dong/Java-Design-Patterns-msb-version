
package com.dongchanglong.factory.methodFactory.factory;

import com.dongchanglong.factory.simpleFactory.factory.AwardType;
import com.dongchanglong.factory.simpleFactory.service.FactoryService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/**
 * 抽象工厂 枚举
 */
@RequiredArgsConstructor
@Getter
public enum WeaponType {

  ONE("1", ElfBlacksimth::new),
  TWO("2", OrcBlacksmith::new),
  ;

  private final String key;
  /**
   * 提供外部获取 实现类  getter
   */
  private final Supplier<Blacksmith> constructor;

  /**
   * 返回具体工厂
   */
  public static Blacksmith getEnum(String code) {
    for (WeaponType weaponType : WeaponType.values()) {
      if (weaponType.getKey().equals(code)) {
        return weaponType.getConstructor().get();
      }
    }
    return null;
  }
}
