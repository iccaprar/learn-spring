package com.baeldung.ls.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PreDestroy;

public class BeanC {

    private static Logger log = LoggerFactory.getLogger(BeanC.class);

    @PreDestroy
    public void preDestroy() {
        log.info("@PreDestroy annotated method is called.");
    }

    public void destroy() {
        log.info("Custom destroy method is called.");
    }

}
