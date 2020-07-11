package ChainOfResponsibilityPattern;

public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;
    public abstract void handleRequest(CallRecord req);
}
