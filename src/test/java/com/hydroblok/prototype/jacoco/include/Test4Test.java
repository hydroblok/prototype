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
    private Test4 test4;

    @Test
    public void test4() {
        assertTrue("test4".equals(test4.test()));
    }
}