package TemplatePattern;

public class Main {
    public static void main(String[] args) {
        Symmetry A = new Vertical();
        Symmetry B = new None();
        Symmetry C = new Horizontal();

        A.print("A");
        B.print("B");
        C.print("C");
    }
}
