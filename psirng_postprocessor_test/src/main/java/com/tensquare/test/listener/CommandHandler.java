package com.tensquare.test.listener;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/3 - 13:58
 */
public interface CommandHandler {

    /**
     * 支持
     * @param cmd
     * @return
     */
    boolean support(String cmd);

    /**
     * 处理命令
     * @param cmd
     * @return
     */
    boolean processCommand(String cmd);

}
