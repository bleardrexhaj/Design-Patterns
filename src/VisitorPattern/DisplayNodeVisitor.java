package VisitorPattern;

import java.util.HashMap;
import java.util.Map;

public class DisplayNodeVisitor implements Visitor {
    private Map<String, Integer> leftList;
    private Map<String, Integer> rightList;
    private String rootName;

    public DisplayNodeVisitor() {

        this.leftList = new HashMap<String, Integer>();
        this.rightList = new HashMap<String, Integer>();
    }

    @Override
    public void visit(Root root) {
        rootName = root.getName();
    }

    @Override
    public void visit(Node node) {
        // TODO Auto-generated method stub
        switch (node.getSide()) {
            case "RIGHT": {
                String name = node.getName().substring(0, 1);
                if (rightList.get(name) != null) {
                    rightList.put(name, rightList.get(name) + 1);
                } else {
                    rightList.put(name, 1);
                }

                break;
            }
            case "LEFT": {
                String name = node.getName().substring(0, 1);
                if (leftList.get(name) != null) {
                    leftList.put(name, leftList.get(name) + 1);
                } else {
                    leftList.put(name, 1);
                }
                break;
            }
        }
    }

    public void displayNodes() {
        System.out.println(rootName);
        System.out.println("Right nodes:");

        for (Map.Entry<String, Integer> entry : rightList.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey() + " Nodes");
        }

        System.out.println("Left nodes:");

        for (Map.Entry<String, Integer> entry : leftList.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey() + " Nodes");
        }
    }
}
