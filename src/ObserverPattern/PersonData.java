package ObserverPattern;

import java.util.ArrayList;

public class PersonData implements Subject {
    ArrayList<Observer> observers;
    private ArrayList<String> names = new ArrayList<>();

    public PersonData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void detach(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex + 1) + " deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(names);
        }
    }

    public void addName(String name) {
        names.add(name);
        notifyObservers();
    }

    public void removeName(String name) {
        int nameIndex = names.indexOf(name);
        names.remove(nameIndex);
        notifyObservers();
    }

}
