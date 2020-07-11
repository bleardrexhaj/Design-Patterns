package VisitorPattern;

public interface Visitor {
    public void visit(Root root);
    public void visit(Node node);
}
