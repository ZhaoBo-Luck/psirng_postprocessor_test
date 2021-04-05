package com.tensquare.test.listener.impl;

import com.tensquare.test.listener.CommandHandler;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/3 - 14:06
 */
@Order(1)
@Component
public class TestCommandHandler implements CommandHandler {

    private static Logger logger = LoggerFactory.getLogger(TestCommandHandler.class);

    @Override
    public boolean support(String cmd) {
        return StringUtils.isNotBlank(cmd);
    }

    @Override
    public boolean processCommand(String cmd) {
        logger.info("default cmd:{}",cmd);
        return false;
    }
}
