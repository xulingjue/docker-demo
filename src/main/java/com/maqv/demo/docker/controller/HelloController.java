package com.maqv.demo.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author lingjue.xu
 * @Description:
 * @date 2019/1/23 18:56
 * @Version V1.0
 */
@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${my.property:defaultValue}")
    protected String fromSystem;

    @GetMapping("")
    public String sayHi() {
        logger.info(String.format("hello %s log!", fromSystem));
        return String.format("hello %s log!", fromSystem);
    }
}
