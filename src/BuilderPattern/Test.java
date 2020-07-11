package BuilderPattern;

public class Test {
    public static void main(String[] args) {
        CallRecordBuilder callRecordBuilder = new CustomerServiceCallBuilder("phone", "agentName", "request content",
                "response content", true, false, false);
        CustomerServiceDirector customerServiceDirector = new CustomerServiceDirector(callRecordBuilder);
        customerServiceDirector.ConstrcutCallRecord();
        System.out.println(customerServiceDirector.getCallRecord().toString());
    }
}
