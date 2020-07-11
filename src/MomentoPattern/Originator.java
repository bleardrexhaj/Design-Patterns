package MomentoPattern;

public class Originator {
    private User user;

    public void set(User user) {
        this.user = user;
    }

    public Memento storeMemento() {
        return new Memento(user);
    }

    public User restoreFromMemento(Memento memento) {
        user = memento.getSavedUser();
        return user;
    }
}
