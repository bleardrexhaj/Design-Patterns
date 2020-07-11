package ChainOfResponsibilityPattern;

public class ChainBuilder {
    private AbstractHandler handler;

    public ChainBuilder() {
        buildChain();
    }

    public AbstractHandler getHandler() {
        return handler;
    }

    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }

    private void buildChain() {
        ValidatorAgent validator = new ValidatorAgent();
        DataWasherAgent washer = new DataWasherAgent();
        ReporterAgent reporter = new ReporterAgent();
        validator.nextHandler = washer;
        washer.nextHandler = reporter;
        handler = validator;
    }

}
