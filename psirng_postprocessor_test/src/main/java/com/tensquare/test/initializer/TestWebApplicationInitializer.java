package com.tensquare.test.initializer;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/7 - 17:25
 */
public class TestWebApplicationInitializer implements WebApplicationInitializer {


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.err.println("呵呵呵");
    }
}
