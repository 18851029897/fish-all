package com.fish;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 桑丰环保
 * User: jiajing
 * Date: 2016/12/28 上午11:30
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    private static Logger baseLog = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        baseLog.info("application start success!");
    }
}
