package TemplatePattern;

import java.util.Arrays;

public abstract class Symmetry {
    protected abstract void identifySymmetry();
    protected abstract void reconstructLetter(String letter);
    protected abstract void printLetter();
    public void print(String letter) {
        identifySymmetry();
        printLetter();
        reconstructLetter(letter);
    }
}
