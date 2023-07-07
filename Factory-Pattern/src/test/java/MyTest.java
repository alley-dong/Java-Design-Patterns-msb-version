import com.dongchanglong.factory.simpleFactory.entity.AwardInfo;
import com.dongchanglong.factory.simpleFactory.entity.Result;
import com.dongchanglong.factory.simpleFactory.factory.AwardType;
import com.dongchanglong.factory.simpleFactory.factory.Factory;
import com.dongchanglong.factory.simpleFactory.service.FactoryService;
import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.Optional;

public class MyTest {

    @Test
    public void testYourMethod() throws Exception {
//        FactoryService awardInfo = Factory.getAwardInfo(Optional.ofNullable(AwardType.getEnum("0")).orElseThrow(()->new Exception("没有当前枚举")));
        FactoryService awardInfo = Factory.getAwardInfo(Optional.ofNullable(AwardType.getEnum("0")).orElseGet(()-> AwardType.DISCOUNT));
        Result instance = awardInfo.getInstance(new AwardInfo());
        System.out.println(instance);
    }
}
