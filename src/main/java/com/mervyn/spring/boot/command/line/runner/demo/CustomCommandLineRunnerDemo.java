package com.mervyn.spring.boot.command.line.runner.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author cs-mervyn
 * @version 1.0
 * @date 2023/11/9 11:00
 */
@Component
public class CustomCommandLineRunnerDemo implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomCommandLineRunnerDemo.class);
    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Command line runner started");
    }
}
