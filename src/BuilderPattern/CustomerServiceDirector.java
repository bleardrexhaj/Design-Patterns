package BuilderPattern;

public class CustomerServiceDirector {
    private CallRecordBuilder callRecordBuilder;

    public CustomerServiceDirector(CallRecordBuilder callRecordBuilder) {
        this.callRecordBuilder = callRecordBuilder;
    }

    public void ConstrcutCallRecord() {
        callRecordBuilder.openCall();
        callRecordBuilder.gatherRequestInformation();
        callRecordBuilder.closeCall();
    }

    public CallRecord getCallRecord() {
        return callRecordBuilder.getCallRecord();
    }

}
