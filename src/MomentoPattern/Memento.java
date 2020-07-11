package MomentoPattern;

public class Memento {
    private User user;

    public Memento(User user) {
        this.user = user;
    }

    public User getSavedUser() {
        return user;
    }
}
