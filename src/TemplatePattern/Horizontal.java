package TemplatePattern;

public class Horizontal extends Symmetry{
    @Override
    protected void identifySymmetry() {
        System.out.println("Horizontal Symmetry");
    }

    @Override
    protected void reconstructLetter(String letter) {
        System.out.println("Letter: " + letter);
    }

    @Override
    protected void printLetter() {
        System.out.println("Printing the letter");
    }
}
