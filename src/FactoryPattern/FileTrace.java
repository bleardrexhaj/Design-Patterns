package FactoryPattern;

public class FileTrace implements Trace{

    @Override
    public void setDebug(boolean debug) {
        System.out.println("debug set "+ debug);
    }

    @Override
    public void debug(String message) {
        System.out.println("debug "+ message);
    }

    @Override
    public void error(String message) {
        System.out.println("error "+ message);
    }
}
