package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        TraceFactory traceFactory = new TraceFactory();
        Trace t1 = traceFactory.createTrace("console");
        t1.debug("started on class "+t1.getClass().getSimpleName());

        Trace t2 = traceFactory.createTrace("trace.log");
        t2.debug("started on class "+t2.getClass().getSimpleName());
    }
}
