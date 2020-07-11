package AdapterPattern;

public class Stack implements Aggregate{
    private Integer arr[];
    private int top;
    private int capacity;
    private int temp = -1;

    Stack(int size)
    {
        arr = new Integer[size];
        capacity = size;
        top = -1;
    }

    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + peek());

        return arr[top--];
    }

    public int peek()
    {
        if (!isEmpty())
            return arr[top];
        else
            System.exit(1);

        return -1;
    }

    public int size()
    {
        return top + 1;
    }

    public Boolean isEmpty()
    {
        return top == -1;
    }

    public Boolean isFull()
    {
        return top == capacity - 1;
    }

    @Override
    public Iterator getIterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator {
        @Override
        public boolean hasNext() {
            if(arr[temp+1] != null)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return arr[++temp];
            }
            return null;
        }
    }
}
