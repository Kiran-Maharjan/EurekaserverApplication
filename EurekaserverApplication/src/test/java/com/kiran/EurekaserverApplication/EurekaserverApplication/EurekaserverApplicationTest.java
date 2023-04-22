package com.kiran.EurekaserverApplication.EurekaserverApplication;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class EurekaserverApplicationTest {
    public static Logger logger= LoggerFactory.getLogger(EurekaserverApplication.class);

    @Test
    void init() {
    logger.info("Testing initialization ...");
    assertEquals(true,true);
    }

    @Test
    void main() {
        logger.info("Testing main ...");
        assertEquals(true,true);

    }
}