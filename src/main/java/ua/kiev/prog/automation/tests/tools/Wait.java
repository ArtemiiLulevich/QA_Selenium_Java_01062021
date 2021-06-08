package ua.kiev.prog.automation.tests.tools;

public class Wait {
    static public void sleep(long ms){
        try {
            Thread.sleep(ms);
        }
        catch (Throwable e) { /*ignore*/ }
    }
}
