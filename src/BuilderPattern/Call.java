package BuilderPattern;

import java.util.Date;

public class Call {
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    private Agent agent;

    public void callPop(Agent agent) {
        this.agent = agent;
        this.requestId = "" + (new Date()).getTime();
    }

    @Override
    public String toString() {
        return "Call{" +
                "requestId='" + requestId + '\'' +
                ", agent=" + agent +
                '}';
    }
}
