package com.tensquare.test.config;

import com.tensquare.test.bean.Car;
import com.tensquare.test.handler.TransactionInvocationHandler;
import com.tensquare.test.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/2/25 - 13:21
 */
@Configuration
@ComponentScan("com.tensquare.test")
public class MainConfiguration {

    @Bean
    public Car car() {
        return new Car();
    }

    /*@Bean
    public TransactionInvocationHandler transactionInvocationHandler() {
        return  new TransactionInvocationHandler("com.tensquare.test.transaction.FoundTransaction");
    }*/


}
