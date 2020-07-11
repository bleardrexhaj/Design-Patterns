package DecoratorPattern;

import java.util.List;

public class ListProfilerImpl extends ListProfilerDecorator {
    private long instantStart;
    private long instantFinish;
    private long timeElapsed;
    private boolean status;

    public ListProfilerImpl(List list) {
        super(list);
    }

    @Override
    public boolean add(Object element) {
        startStopWatch();
        status = super.add(element);
        endStopWatch();
        return status;
    }

    @Override
    public boolean remove(Object object) {
        startStopWatch();
        status = super.remove(object);
        endStopWatch();
        return status;
    }

    @Override
    public boolean contains(Object object) {
        startStopWatch();
        status = super.contains(object);
        endStopWatch();
        return status;
    }

    @Override
    public int size() {
        startStopWatch();
        int size = super.size();
        endStopWatch();
        return size;
    }

    private void startStopWatch() {
        instantStart = System.nanoTime();
    }

    private void endStopWatch() {
        instantFinish = System.nanoTime();
        timeElapsed = (instantFinish - instantStart) / 1000;
    }

    public void printExecutionTime(String dataStructure) {
        System.out.println("Execution time for last operation " + dataStructure + " - " + timeElapsed);
    }
}
