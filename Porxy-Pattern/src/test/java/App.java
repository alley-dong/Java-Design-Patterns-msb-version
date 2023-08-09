import com.dongchanglong.demo01.IUserDao;
import com.dongchanglong.demo01.UserProxy;
import com.dongchanglong.demo01.UserServiceImpl;
import com.dongchanglong.demo02.PorxyFactory;
import com.dongchanglong.dmeo03.CgUserServiceImpl;
import com.dongchanglong.dmeo03.UserLogProxy;
import org.junit.jupiter.api.Test;

public class App {

    /**
     * 静态代理
     *    优点：可以在不修改目标类的情况下，对目标类进行功能扩展。
     *    缺点：
     *        1.冗余，因为代理要实现和目标类一致的接口，会产生很多的代理。
     *        2.一旦接口中增加方法，目标对象和代理对象就要修改，违背了开闭原则。
     */
    @Test
    public void demo01(){

        // 目标类
        IUserDao userDao = new UserServiceImpl();
        // 代理类
        UserProxy userProxy = new UserProxy(userDao);
        userProxy.save();
    }

    /**
     * JDK动态代理
     */
    public static void main(String[] args) {
        // 目标类
        IUserDao userDao = new UserServiceImpl();
        // 目标对象的信息
        System.out.println(userDao.getClass());
        // 获取代理对象
        IUserDao proxyInstance = (IUserDao)new PorxyFactory(userDao).getProxyInstance();
        System.out.println(proxyInstance.getClass());
        proxyInstance.delete(1);

        while (true){}
    }

    /**
     * Cglib动态代理
     */
    @Test
    public void demo03(){
        // 目标类
        CgUserServiceImpl userDao = new CgUserServiceImpl();
        System.out.println(userDao.getClass());
        // 代理类
        CgUserServiceImpl logProxy = (CgUserServiceImpl)new UserLogProxy().getLogProxy(userDao);
        System.out.println(logProxy.getClass());
        System.out.println("用户信息："+logProxy.userList());
    }
}
