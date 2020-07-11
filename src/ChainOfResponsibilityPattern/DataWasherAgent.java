package ChainOfResponsibilityPattern;

public class DataWasherAgent extends AbstractHandler{
    @Override
    public void handleRequest(CallRecord rec) {
        rec.setASalesLead(true);
        if (nextHandler != null)
            nextHandler.handleRequest(rec);
    }
}
