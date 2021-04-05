package singleton;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/3 - 21:16
 */
public class Client {

    public static void main(String[] args) {
        SingletonTest instance = SingletonTest.INSTANCE;
        SingletonTest name = SingletonTest.NAME;
        System.out.println(instance.ordinal());
        System.out.println(name.ordinal());
        instance.test();

        System.out.println("=========================================================");

        System.out.println(Season.SPRING);
        System.out.println(Season.SPRING.toString().equals("SPRING"));
    }
}
