package TemplatePattern;

public class None extends Symmetry{
    @Override
    protected void identifySymmetry() {
        System.out.println("Non Symmetric");
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
