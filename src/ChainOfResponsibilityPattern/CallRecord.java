package ChainOfResponsibilityPattern;

public class CallRecord extends AbstractHandler{

    private boolean salesLead = false;
    private Customer customer;
    private String requestInfo;

    public void setASalesLead(boolean b) {
        this.salesLead = b;
    }

    public boolean isSalesLead() {
        return salesLead;
    }

    public void setSalesLead(boolean salesLead) {
        this.salesLead = salesLead;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setValid(boolean b) {
        this.salesLead = b;
    }

    @Override
    public void handleRequest(CallRecord req) {

    }

    public String getRequestInformation() {
        return requestInfo;
    }

    public void setRequestInformation(String s) {
        this.requestInfo = s;
    }
}
