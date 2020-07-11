package AdapterPattern;

public class Queue implements Aggregate{
    private Integer arr[];  		// array to store queue elements
    private int front;  		// front points to front element in the queue
    private int rear;   		// rear points to last element in the queue
    private int capacity;   	// maximum capacity of the queue
    private int count;  		// current size of the queue
    private int temp = -1;

    Queue(int size) {
        arr = new Integer[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void dequeue()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % capacity;
        count--;
    }

    public void enqueue(int item)
    {
        // check for queue overflow
        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }

    // Utility function to check if the queue is full or not
    public Boolean isFull()
    {
        return (size() == capacity);
    }

    public int size()
    {
        return count;
    }

    public Boolean isEmpty()
    {
        return (size() == 0);
    }

    @Override
    public Iterator getIterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator {
        @Override
        public boolean hasNext() {
            if(arr[temp+1] != null){
                return true;
            }
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
