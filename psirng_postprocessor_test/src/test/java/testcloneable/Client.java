package testcloneable;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/10 - 22:34
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        TestCloneable testCloneable = new TestCloneable(user);
        TestCloneable clone = testCloneable.clone();
        System.out.println("克隆出来的对象和原型对象是同一个对象吗？" + (testCloneable == clone));
        System.out.println("克隆出来的对象和原型对象的属性引用是同一个对象吗？" + (testCloneable.getUser() == clone.getUser()));
    }
}
