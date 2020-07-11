package CompositePattern;

import java.util.List;

public class Tag extends HTMLObject{
    public Tag(String name, String innerHTML, List<Attribute> attributes) {
        super(name, innerHTML, attributes);
    }

    @Override
    public void paint() {
        String attributesHTML = "";
        if (attributes != null) {
            for (Attribute attribute : attributes) {
                attributesHTML += attribute.getName() + "=" + "\"" + attribute.getValue() + "\" ";
            }
        }
        System.out.println("<" + name + " " + attributesHTML + ">" + innerHTML + "</" + name + ">");
    }
}
