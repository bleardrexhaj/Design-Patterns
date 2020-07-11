package SingletonPattern;

public class SingletonInstance {
    private static SingletonInstance singleton = null;
    private SingletonInstance(){
        System.out.println("hi from Thread: "+this);
    }

    public static SingletonInstance getSingleton() {
        if(singleton == null){
            synchronized (SingletonInstance.class) {
                if(singleton == null)
                    singleton = new SingletonInstance();
            }
        }
        return singleton;
    }
}
