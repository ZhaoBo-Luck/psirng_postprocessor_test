package runtime;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/3 - 22:06
 */
public class RuntimeTest {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());

        Runtime runtime1 = Objects.requireNonNull(runtime);

        try {
            Process process = runtime.exec("ipconfig -all");
            InputStream inputStream = process.getInputStream();

            byte[] arr = new byte[1024*1024*1024];
            int length = inputStream.read(arr);
            System.out.println(new String(arr,0,length,"gbk"));


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("===============================funny-ma-gou-pee==================================");
       // String test = test();
       // out.println(test);
    }

    //public static native  String test();

}
