package BuilderPattern;

public class CustomerServiceCallBuilder implements CallRecordBuilder {

    private CallRecord callRecord;
    private Call call;
    private Request request;
    private Agent agent;
    private Customer customer;
    String phone;
    String agentName;
    String requestContent;
    String responseContent;
    boolean isAnswered;
    boolean isNeedCallBack;
    boolean isSalesLead;

    public CustomerServiceCallBuilder(String phone, String agentName, String requestContent, String responseContent, boolean isAnswered, boolean isNeedCallBack, boolean isSalesLead) {
        callRecord = new CallRecord();
        call = new Call();
        request = new Request();
        agent = new Agent();
        this.phone = phone;
        this.agentName = agentName;
        this.requestContent = requestContent;
        this.responseContent = responseContent;
        this.isAnswered = isAnswered;
        this.isNeedCallBack = isNeedCallBack;
        this.isSalesLead = isSalesLead;
        this.customer = new Customer();
    }

    @Override
    public void openCall() {
        this.agent.setID(10);
        this.agent.setName(this.agentName);
        call.callPop(agent);
        customer.setEmail("test@email.com");
        customer.setID(123);
        customer.setPhone(this.phone);
    }

    @Override
    public void gatherRequestInformation() {
        this.request.setAgent(agent);
        this.request.setRequester(customer);
        this.request.setReqId(call.getRequestId());
        this.request.setReqContent(requestContent);
    }

    @Override
    public void closeCall() {
        this.request.setAnswered(this.isAnswered);
        this.request.setNeedCallBack(this.isNeedCallBack);
        this.request.setSaleLead(isSalesLead);
        this.request.setRespContent(responseContent);
        callRecord.setRequest(this.request);
        callRecord.setCall(this.call);
    }

    @Override
    public CallRecord getCallRecord() {
        return this.callRecord;
    }

}
