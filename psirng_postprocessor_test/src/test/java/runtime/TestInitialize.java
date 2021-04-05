package runtime;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/10 - 21:36
 */
public class TestInitialize extends TestInitializer{

    static {
        System.out.println("静态代码块执行了....");
    }

    private static TestInitializer testInitializer = new TestInitializer("呵呵");

    private String sex;

    public TestInitialize(String sex) {
        super("sex");

        System.out.println("TestInitialize构造方法执行了。。。。。。");
        this.sex = sex;
    }

    public static void main(String[] args) {

        System.out.println("main方法执行开始！");
        TestInitialize testInitialize = new TestInitialize("女");
        testInitialize.test();
        System.out.println("main方法执行完毕！");
    }

    public void test() {
        System.out.println("test方法执行了。。。");
    }
}
