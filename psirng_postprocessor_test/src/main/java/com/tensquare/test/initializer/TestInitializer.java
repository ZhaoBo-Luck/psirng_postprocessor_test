package com.tensquare.test.initializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/7 - 17:16
 */
public class TestInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.err.println("哈哈哈哈哈哈");
    }
}
