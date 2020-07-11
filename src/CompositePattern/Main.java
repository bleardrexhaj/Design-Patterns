package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Element html = new Element("HTML", "");
        Element head = new Element("HEAD", "");
        Tag title = new Tag("TITLE", "Your Title Here", null);
        Element body = new Element("BODY", "");
        Element center = new Element("CENTER", "<IMG SRC=\"clouds.jpg\">");
        List<Attribute> attrs = new ArrayList<>();
        Attribute attr = new Attribute("href", "http://somegreatsite.com");
        attrs.add(attr);
        Tag a = new Tag("a", "Link Name", attrs);
        Tag h1 = new Tag("H1", "This is a Header", null);
        Tag h2 = new Tag("H2", "This is a Medium Header", null);
        Tag b1 = new Tag("B", "This is a new paragraph!", null);
        Element b2 = new Element("B", "");
        Tag i = new Tag("I", "This is a new sentence without a paragraph break, in bold italics.", null);


        html.addObject(head);
        head.addObject(title);
        html.addObject(body);
        body.addObject(center);
        body.addObject(a);
        body.addObject(h1);
        body.addObject(h2);
        body.addObject(b1);
        body.addObject(b2);
        b2.addObject(i);

        html.paint();
    }
}
