package ObserverPattern;

public class Test {
    public static void main(String[] args) {
        PersonData personsData = new PersonData();

        PersonObserver observer1 = new PersonObserver(personsData);
        System.out.println("Update 2 The list contains:");
        personsData.addName("Bleard Rexhaj");

        System.out.println("\nUpdate 2 The list contains:");
        personsData.addName("Perry Luigi");
    }
}
