package ObserverPattern;

import java.util.Collection;

public class PersonObserver implements Observer {
    private Collection<String> names;

    private Subject personsGrabber;

    public PersonObserver(Subject personsGrabber) {
        this.personsGrabber = personsGrabber;
        personsGrabber.attach(this);
    }

    @Override
    public void update(Collection<String> names) {
        this.names = names;
        displayInUI();
    }

    private void displayInUI() {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
