package com.tensquare.test.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/3 - 13:56
 */
@Component
public class TestListener {

    @Autowired
    private List<CommandHandler> commandHandlers;

    @PostConstruct
    public void init() {
        //给Handler排序
        AnnotationAwareOrderComparator.sort(commandHandlers);
        // 新建线程进行持续监听
        new Thread(this::startListener).start();
    }

    private void startListener() {
        /*while (true) {
            if (commandHandlers.size() > 0) {
                for (CommandHandler commandHandler : commandHandlers) {
                    if (commandHandler.support("cmd")) {
                        try {
                            Thread.sleep(3000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        commandHandler.processCommand("Fuck your mama");
                    }
                }
            }
        }*/
    }


}
