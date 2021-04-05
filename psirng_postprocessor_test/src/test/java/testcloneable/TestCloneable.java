package testcloneable;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/10 - 22:32
 */
public class TestCloneable implements Cloneable {

    private User user;

    public TestCloneable(User user) {
        this.user = user;
        System.out.println("具体原型对象被创建！");
    }

    @Override
    protected TestCloneable clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (TestCloneable) super.clone();
    }

    public User getUser() {
        return user;
    }
}
