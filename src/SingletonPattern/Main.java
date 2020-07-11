package SingletonPattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(() -> {
            Singleton.getSingleton();
            SingletonInstance.getSingleton();
        });
        Thread th1 = new Thread(() -> {
            Singleton.getSingleton();
            SingletonInstance.getSingleton();
        });
        th1.start();
        th.start();

    }
}
