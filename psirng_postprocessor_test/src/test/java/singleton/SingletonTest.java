package singleton;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/3 - 21:15
 */
public enum  SingletonTest {

    NAME("芳子"),INSTANCE("川田");

    private String name;

    SingletonTest(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("你妹的，这是用来干啥的啊！");
    }

    @Override
    public String toString() {
        return "SingletonTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
