package com.hydroblok.prototype.jacoco.include;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test4Test {

    @Autowired
    private Test3 test3;

    @Test
    public void test1() {
        assertTrue("test4".equals(test3.test()));
    }
}