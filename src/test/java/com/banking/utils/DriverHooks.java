package com.banking.utils;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverHooks {


        private static final Logger logger = LoggerFactory.getLogger(DriverHooks.class);

        @BeforeScenario
        public void setUp() {
            String browser = System.getenv("BROWSER") != null ? System.getenv("BROWSER") : "chrome";
            boolean isHeadless = System.getenv("HEADLESS") != null && System.getenv("HEADLESS").equalsIgnoreCase("true");
            logger.info("Initializing driver for browser: {} with headless mode: {}", browser, isHeadless);
            DriverFactory.getDriver(browser, isHeadless);
        }

        @AfterScenario
        public void tearDown() {
            logger.info("Quitting the driver.");
            DriverFactory.quitDriver();
        }
}

