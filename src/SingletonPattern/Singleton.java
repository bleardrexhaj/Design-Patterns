package SingletonPattern;

public class Singleton {
    private static Singleton singleton = null;
    private Singleton(){
        System.out.println("hi from Thread: "+this);
    }

    public static synchronized Singleton getSingleton() {
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
