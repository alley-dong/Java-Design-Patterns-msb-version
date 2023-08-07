import com.dongchanglong.prototype.demo01.Address;
import com.dongchanglong.prototype.demo01.ConcretePrototype;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest<S> {


    /**
     * 深拷贝
     * @throws Exception
     */
    @Test
    public void test01() throws Exception {
        Address address = new Address("18840920318");
        ConcretePrototype c1 = new ConcretePrototype("张三",address);
        ConcretePrototype clone = c1.clone();
        System.out.println("对象name属性======"+ (c1.getName() == clone.getName()));
        System.out.println("对象Address引用属性======"+(c1.getAddress() == clone.getAddress()));
        System.out.println("对象地址======" + (c1 == clone));

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("a.txt"));
        outputStream.writeObject(c1);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("a.txt"));
        ConcretePrototype c2 = (ConcretePrototype)inputStream.readObject();
        System.out.println("序列化后c1和c2====="+ (c1.getAddress() == c2.getAddress()));
    }
}
