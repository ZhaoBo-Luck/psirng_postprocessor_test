package tensquare;

import com.tensquare.test.bean.Car;
import com.tensquare.test.config.MainConfiguration;
import com.tensquare.test.service.TestService;
import com.tensquare.test.transaction.FoundTransaction;
import org.junit.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/2/25 - 13:21
 */
public class IOCTest {

    @Test
    public void demo1() {
        AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(MainConfiguration.class);
        //FoundTransaction bean = acc.getBean(FoundTransaction.class);
        //bean.testFound();
        //System.err.println(bean.getClass());
        TestService bean1 = acc.getBean(TestService.class);

        bean1.test();
        bean1.demo();
        //acc.setParent(new AnnotationConfigApplicationContext());
    }
}
