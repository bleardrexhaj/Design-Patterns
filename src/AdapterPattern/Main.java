package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        Stack stack = new Stack(10);

        Iterator iteratorQueue = queue.getIterator();
        Iterator iteratorStack = stack.getIterator();

        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(5);

        stack.push(2);
        stack.push(1);

        while (iteratorQueue.hasNext()){
            System.out.println(iteratorQueue.next());
        }

        System.out.println("------------------");

        while (iteratorStack.hasNext()){
            System.out.println(iteratorStack.next());
        }
    }
}
