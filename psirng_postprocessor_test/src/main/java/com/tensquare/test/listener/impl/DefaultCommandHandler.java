package com.tensquare.test.listener.impl;

import com.tensquare.test.listener.CommandHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/3 - 14:00
 */
@Order(Ordered.LOWEST_PRECEDENCE)
@Component
public class DefaultCommandHandler implements CommandHandler{

    private static Logger logger = LoggerFactory.getLogger(DefaultCommandHandler.class);

    @Override
    public boolean support(String cmd) {
        return true;
    }

    @Override
    public boolean processCommand(String cmd) {

        logger.info("default cmd:{}",cmd);
        return true;
    }
}
