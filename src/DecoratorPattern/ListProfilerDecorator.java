package DecoratorPattern;

import java.util.List;

public class ListProfilerDecorator<T> {
    private List<T> list;

    public ListProfilerDecorator(List<T> list) {
        this.list = list;
    }

    public boolean add(T element) {
        return list.add(element);
    }

    public boolean remove(Object object) {
        return list.remove(object);
    }

    public boolean contains(Object object) {
        return list.contains(object);
    }

    public int size() {
        return list.size();
    }

}
