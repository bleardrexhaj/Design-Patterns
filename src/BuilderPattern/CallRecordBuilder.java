package BuilderPattern;

public interface CallRecordBuilder {
    public void openCall();
    public void gatherRequestInformation();
    public void closeCall();
    public CallRecord getCallRecord();
}
