package dynamic;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/31 - 22:27
 */
public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Daisy");
        System.out.println("User："+JSON.toJSONString(user));
        Map<String,Object> propertiesMap = new HashMap<String,Object>();
        propertiesMap.put("age", 18);
        propertiesMap.put("address", "北京市北七家镇东三旗村");
        propertiesMap.put("sex", "男");
        Object obj = ReflectUtil.getObject(user, propertiesMap);
        System.out.println("动态为User添加age之后，User："+ JSON.toJSONString(obj));
    }

}
