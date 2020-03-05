package com.yan.crowdfunding;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author
 * @date 2020/3/5 18:13
 */
public class SLF4JTest {

    @Test
    public void test1(){
        Logger log = LoggerFactory.getLogger(SLF4JTest.class);

        log.debug("debug级别日志 用户name={}","张三");

    }

}
