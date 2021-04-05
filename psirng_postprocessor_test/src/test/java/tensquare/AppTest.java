package tensquare;

import com.tensquare.test.TestApplication;
import com.tensquare.test.service.TestService;
import junit.extensions.TestSetup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/2/24 - 17:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class AppTest {

    @Autowired
    private TestService testService;

    @Test
    public void testDemo() throws Exception {
        //TestFactoryBeanHandler handler = new TestFactoryBeanHandler();
        //Object object = handler.getObject();
        testService.demo();
        testService.test();
    }
}
