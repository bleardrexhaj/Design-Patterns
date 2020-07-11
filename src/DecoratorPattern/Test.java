package DecoratorPattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ListProfilerImpl listProfilerArrayList = new ListProfilerImpl(new ArrayList<String>());

        listProfilerArrayList.add("a");
        listProfilerArrayList.printExecutionTime("Add to ArrayList");
        listProfilerArrayList.add("b");
        listProfilerArrayList.printExecutionTime("Add to ArrayList");
        listProfilerArrayList.contains("b");
        listProfilerArrayList.printExecutionTime("Contained in ArrayList");
        listProfilerArrayList.size();
        listProfilerArrayList.printExecutionTime("Size of ArrayList");
        List<String> ll = new LinkedList<>();
        ListProfilerImpl listProfilerLinkedList = new ListProfilerImpl(new LinkedList<String>());
        listProfilerLinkedList.add("d");
        listProfilerLinkedList.printExecutionTime("Add to LinkedList");
        listProfilerLinkedList.add("e");
        listProfilerLinkedList.printExecutionTime("Add to LinkedList");
        listProfilerLinkedList.contains("d");
        listProfilerLinkedList.printExecutionTime("Contained in LinkedList");
        listProfilerLinkedList.size();
        listProfilerLinkedList.printExecutionTime("Size of LinkedList");

    }
}
