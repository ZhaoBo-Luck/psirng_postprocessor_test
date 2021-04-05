package runtime;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/10 - 21:36
 */
public class TestInitializer {

    private String name;

    public TestInitializer(String name) {
        System.out.println("TestInitializer 构造方法执行了");
        this.name = name;
    }
}
