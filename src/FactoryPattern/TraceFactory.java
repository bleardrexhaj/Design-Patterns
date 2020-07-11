package FactoryPattern;

public class TraceFactory {
    private static final TraceFactory traceFactory = new TraceFactory();

    public Trace createTrace(String type){
        if (type == null || type.equals(""))
            return null;
        if (type.equals("trace.log")) {
            return new FileTrace();
        } else if (type.equals("console")) {
            return new ConsoleTrace();
        }

        return null;
    }

    public static TraceFactory getTraceFactory() {
        return traceFactory;
    }
}
