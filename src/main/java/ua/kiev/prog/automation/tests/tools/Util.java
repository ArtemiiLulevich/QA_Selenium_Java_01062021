package ua.kiev.prog.automation.tests.tools;

import org.apache.commons.lang3.RandomStringUtils;

abstract public class Util {
    static public String randomString(int size) {
        return RandomStringUtils.random(size, true, true);
    }
}
