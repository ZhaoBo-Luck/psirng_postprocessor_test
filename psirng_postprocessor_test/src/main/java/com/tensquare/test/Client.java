package com.tensquare.test;

import org.apache.tomcat.util.net.openssl.OpenSSLUtil;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/11 - 8:27
 */
public class Client {

    public static final String BIST_FACTORIES_PATH = "META-INF/bist.factories";

    public static void main(String[] args) throws IOException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        Enumeration<URL> urls = classLoader.getResources(BIST_FACTORIES_PATH);

        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            System.out.println(url);
        }
    }
}
