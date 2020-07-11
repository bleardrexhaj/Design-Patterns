package BuilderPattern;

public class CallRecord {
    private Request request;
    private Call call;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "CallRecord{" +
                "request=" + request +
                ", call=" + call +
                '}';
    }
}
