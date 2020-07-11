package VisitorPattern;

public class Root implements Item {
    private String side;
    private String name;

    public Root(String name, String side) {
        this.side = side;
        this.name = name;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
