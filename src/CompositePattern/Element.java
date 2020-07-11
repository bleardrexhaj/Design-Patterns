package CompositePattern;

import java.util.ArrayList;
import java.util.Collection;

public class Element extends HTMLObject {
    protected Collection<HTMLObject> htmlObjects = new ArrayList<>();

    public Element(String name, String innerHTML) {
        super(name, innerHTML);
    }

    public void addObject(HTMLObject object) {
        htmlObjects.add(object);
    }

    @Override
    public void paint() {
        System.out.println("<" + name + ">" + innerHTML);

        for (HTMLObject object : htmlObjects) {
            object.paint();
        }
        System.out.println("</" + name + ">");
    }
}
