package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Root("Topic", "NONE"));
        items.add(new Node("A", "RIGHT"));
        items.add(new Node("A1", "RIGHT"));
        items.add(new Node("AA1", "RIGHT"));
        items.add(new Node("AA2", "RIGHT"));
        items.add(new Node("AA3", "RIGHT"));
        items.add(new Node("A2", "RIGHT"));
        items.add(new Node("B", "RIGHT"));
        items.add(new Node("B1", "RIGHT"));
        items.add(new Node("B2", "RIGHT"));
        items.add(new Node("C", "RIGHT"));
        items.add(new Node("C1", "RIGHT"));
        items.add(new Node("C2", "RIGHT"));
        items.add(new Node("D", "LEFT"));
        items.add(new Node("D1", "LEFT"));
        items.add(new Node("D2", "LEFT"));
        items.add(new Node("E", "LEFT"));
        items.add(new Node("E1", "LEFT"));
        items.add(new Node("E2", "LEFT"));
        items.add(new Node("E3", "LEFT"));
        items.add(new Node("F", "LEFT"));
        items.add(new Node("F1", "LEFT"));
        items.add(new Node("F2", "LEFT"));
        DisplayNodeVisitor visitor = new DisplayNodeVisitor();
        for (Item item : items) {
            item.accept(visitor);
        }
        visitor.displayNodes();
    }
}
