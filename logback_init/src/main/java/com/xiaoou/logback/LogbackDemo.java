/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.xiaoou.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xiaoou on 16/7/27.
 * @author xiaoou
 * @version 1.0
 * Logback first demo.
 *
 */
public class LogbackDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackDemo.class);

    public static void main(String[] args) {
        LOGGER.trace("======trace");
        LOGGER.debug("======debug");
        LOGGER.info("======info");
        LOGGER.warn("======warn");
        LOGGER.error("======error");
    }
}
