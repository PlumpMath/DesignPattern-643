package bastawesy.patterns.singleton;

/**
 * this class explain the Singleton Design pattern
 * Created by ahmed.bastawesy on 9/4/2016.
 */
public class Singleton {

    private static Singleton singleton;
    /**
     * using volatile key word to ensure that any thread to volatileSingleton read the latest changes to it
     * Volatile uses main memory - not cpu cash- to read and write from object.
     * Without volatile, readers could see some non updated value.
     * Volatile ensure ordering meaning that writing to volatile variable happens before reading from it.
     */
    private static volatile Singleton volatileSingleton;
    private static Singleton eagerSingleton = new Singleton();

    private Singleton() {
    }

    /**
     * this is our first approach to create unique instance from Singleton class.
     * The main problem here is Concurrency meaning that if we have to threads running and both of them need an instance
     * from Singleton class, both of them may acces getInstanceAttempt1() method at the same time resulting in to creating
     * two instances from the  same class
     *
     * @return singleton
     */
    public static Singleton getInstanceAttempt1() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    /**
     * this our second approach to create unique instance from Singleton class
     * Here we solved the problem of concurrency found at getInstanceAttempt1() method
     * and we are sure that getInstanceAttempt2() method will be accessed only
     * by one thread at any time
     * The main problem here  is that synchronized method is expensive but we can ignore this problem if and only if
     * calling getInstanceAttempt2() is not causing substantial overhead for our application.
     * If a high traffic of code start using getInstanceAttempt2(), we may reconsider .
     *
     * @return singleton
     */
    public static synchronized Singleton getInstanceAttempt2() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


    /**
     * this our third approach to create unique instance from Singleton class
     * Here we solved the problem of expensive calling to synchronized getInstanceAttempt2() method be eagerly initialize
     * eagerSingleton object and we ensure here that eagerSingleton is initialized when loading Singleton class
     * before any thread can access the class
     *
     * @return eagerSingleton
     */
    public static Singleton getInstanceAttempt3() {
        if (eagerSingleton == null) {
            eagerSingleton = new Singleton();
        }
        return eagerSingleton;
    }

    /**
     * this our fourth approach to create unique instance from Singlton class
     * Here we used the ' Double Checked Locking ' to solved the problem of expensive calling to synchronized
     * getInstanceAttempt2()
     *
     * @return volatileSingleton
     */
    public static Singleton getInstanceAttempt4() {
        if (volatileSingleton == null) {
            synchronized (Singleton.class) {
                if (volatileSingleton == null) {
                    volatileSingleton = new Singleton();
                }
            }
        }
        return volatileSingleton;
    }
}
