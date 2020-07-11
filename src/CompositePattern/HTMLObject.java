package CompositePattern;

import java.util.List;

public abstract class HTMLObject {
        protected String name;
        protected String innerHTML;
        protected List<Attribute> attributes;

        public HTMLObject(String name, String innerHTML) {
            this.name = name;
            this.innerHTML = innerHTML;
        }

        public HTMLObject(String name, String innerHTML, List<Attribute> attributes) {
            this.name = name;
            this.innerHTML = innerHTML;
            this.attributes = attributes;
        }

        public abstract void paint();
}
