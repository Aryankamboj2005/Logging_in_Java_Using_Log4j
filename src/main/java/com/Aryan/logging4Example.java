package com.Aryan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logging4Example {

    // initilizing the logger
    private static final Logger logger = LogManager.getLogger(logging4Example.class);

    /**
     * LOG4J PATTERN REFERENCE: %d - %c -[%M] -(%p) -%m -%n
     * --------------------------------------------------
     * %d  -> Date/Time of the log
     * %c  -> Class Name (Category)
     * %M  -> Method Name
     * %p  -> Log Level (Priority)
     * %m  -> The Log Message
     * %n  -> Newline
     */

    public static void main(String[] args) {

        process();
    }

    public static void process() {
        // just practicing

        logger.trace("tracing the mmessage");
        logger.debug("debuged message ");
        logger.info("from the info part");
        logger.warn("from the warn part");
        logger.error("from the error part");
        logger.fatal("from teh fattal method");
    }
}
