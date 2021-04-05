package com.tensquare.test.controller;

import com.tensquare.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/4 - 10:39
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String test() {
        testService.test();
        testService.demo();
        return "success!";
    }
}
