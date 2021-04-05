package com.tensquare.test.factory;

import com.tensquare.test.handler.TransactionInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: Luck-zb
 * description：交易接口注册
 * Date：2021/3/2 - 13:22
 */
@Configuration
public class TransactionRegistrar implements BeanDefinitionRegistryPostProcessor,BeanClassLoaderAware {

    private ClassLoader classLoader;

    /**
     * 注册交易接口
     *
     * @param registry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

        Map<String, String> classNames = new HashMap<>();
        classNames.put("foundTransaction", "com.tensquare.test.transaction.FoundTransaction");
        classNames.put("testTransaction", "com.tensquare.test.transaction.TestTransaction");

        Set<Map.Entry<String, String>> entries = classNames.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            GenericBeanDefinition bd = new GenericBeanDefinition();

            bd.setBeanClass(TransactionInvocationHandler.class);
            ConstructorArgumentValues cavs = new ConstructorArgumentValues();
            cavs.addIndexedArgumentValue(0, entry.getValue());
            cavs.addIndexedArgumentValue(1, this.classLoader);
            bd.setConstructorArgumentValues(cavs);

            registry.registerBeanDefinition(entry.getKey(), bd);
        }

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }

    /**
     * 这个其实就是模板方法模式
     * @param classLoader
     */
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
}
