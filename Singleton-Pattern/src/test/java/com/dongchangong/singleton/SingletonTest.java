package com.dongchangong.singleton;

import org.junit.jupiter.api.Test;

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

public class SingletonTest<S> {

    /**
     * 单一实例的getInstance方法。
     */
    private final Supplier<S> singletonInstanceMethod;

    /**
     * final修饰属性 需要在构造方法中初始化 或者 对属性进行赋值
     */
    public SingletonTest(Supplier<S> singletonInstanceMethod) {
        this.singletonInstanceMethod = singletonInstanceMethod;
    }

    /**
     * 使用给定的“getInstance”方法创建新的单一实例测试实例
     */
    @Test
    public void testMultipleCallsReturnTheSameObjectInSameThread(){
        S instance1 = this.singletonInstanceMethod.get();
        S instance2 = this.singletonInstanceMethod.get();
        S instance3 = this.singletonInstanceMethod.get();
        assertSame(instance1, instance2);
        assertSame(instance1, instance3);
        assertSame(instance2, instance3);
    }

    /**
     * 使用给定的“getInstance”方法创建新的单一实例测试实例
     */
    @Test
    void testMultipleCallsReturnTheSameObjectInDifferentThreads() throws Exception{
        // assertTimeout - junit5
        assertTimeout(ofMillis(10000), () -> {
            // 创建 10000 个任务，并在每个可调用对象中实例化单例类
            final ArrayList<Callable<S>> tasks = IntStream.range(0, 10000)
                    .<Callable<S>>mapToObj(i -> this.singletonInstanceMethod::get)
                    .collect(Collectors.toCollection(ArrayList::new));

            // 最多使用 8 个并发线程来处理任务
            final ExecutorService executorService = Executors.newFixedThreadPool(8);
            List<Future<S>> results = executorService.invokeAll(tasks);

            // 等待所有线程完成
            S expectedInstance = this.singletonInstanceMethod.get();
            for (Future<S> res : results) {
                S instance = res.get();
                assertNotNull(instance);
                assertSame(expectedInstance, instance);
            }

            // tidy up the executor
            executorService.shutdown();
        });
    }
}
