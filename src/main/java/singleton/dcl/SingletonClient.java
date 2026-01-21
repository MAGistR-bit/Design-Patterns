package singleton.dcl;

public class SingletonClient {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
}
