package com.tensquare.test.handler;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: Luck-zb
 * description：交易接口代理
 * Date：2021/3/2 - 13:11
 */
public class TransactionInvocationHandler implements FactoryBean,InvocationHandler {

    private String className;
    private ClassLoader classLoader;

    public TransactionInvocationHandler(String className,ClassLoader classLoader) {
        this.className = className;
        this.classLoader = classLoader;
    }

    @Override
    public Object getObject() throws Exception {
        return Proxy.newProxyInstance(classLoader, new Class[]{getObjectType()}, this);
    }

    @Override
    public Class<?> getObjectType() {
        try {
            return Class.forName(className, false, classLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 实现业务逻辑,比如发起网络连接，执行远程调用，获取到结果，并返回
        System.err.println("哈哈哈! 我是invoke方法,可以在这里实现业务逻辑,比如发起网络连接，执行远程调用，获取到结果，并返回：" + className);
        return null;
    }

}
