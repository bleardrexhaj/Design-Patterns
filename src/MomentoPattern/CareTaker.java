package MomentoPattern;

import java.util.ArrayList;

public class CareTaker {
    ArrayList<Memento> savedUsers = new ArrayList<>();

    public void addMemento(Memento memento) {
        savedUsers.add(memento);
    }

    public Memento getMemento(int index) {
        return savedUsers.get(index);
    }
}
