package com.tensquare.test.service;

import com.tensquare.test.transaction.FoundTransaction;
import com.tensquare.test.transaction.TestTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Luck-zb
 * description：TODO
 * Date：2021/3/2 - 13:45
 */
@Service
public class TestService {

    @Autowired()
    private FoundTransaction foundTransaction;

    @Autowired
    private TestTransaction testTransaction;

    public void test() {
        foundTransaction.testFound();
    }

    public void demo() {
        testTransaction.demo();
    }
}
