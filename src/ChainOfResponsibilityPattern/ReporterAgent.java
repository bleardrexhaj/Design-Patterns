package ChainOfResponsibilityPattern;

public class ReporterAgent extends AbstractHandler{
    @Override
    public void handleRequest(CallRecord rec) {
        // TODO Auto-generated method stub
        System.out.println("Customer name is \n" + rec.getCustomer().getFirstName());
        System.out.println("the request details is \n" + rec.getRequestInformation());
        if (nextHandler != null)
            nextHandler.handleRequest(rec);

    }
}
