package Library;
/**
 This program: / from SDA course
 - Demonstrates Design Pattern Singleton usage

 Some Notes:
 - In object-oriented programming, a singleton class is a class that can have only one object
    (an instance of the class) at a time.
 - To design a singleton class:
 --- Make constructor as private.
 --- Write a static method that has return type object of this singleton class.

 Created at 2020-02
 */
public class SingletonUsage {

    public static void main(String args[]) {

        // Every day use
        Runtime singletonRuntime = Runtime.getRuntime();
        // singletonRuntime.gc();
        System.out.println(singletonRuntime);
        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);

        if(singletonRuntime == anotherInstance) {
            System.out.println("They are the same instance");
        }

        NaiveEagerSingleton naiveEagerSingleton = NaiveEagerSingleton.getInstance();
        System.out.println(naiveEagerSingleton);

        NaiveEagerSingleton naiveEagerSingleton2 = NaiveEagerSingleton.getInstance();
        System.out.println(naiveEagerSingleton2);

        // constructor is private so we can't call it
        // NaiveEagerSingleton naiveEagerSingleton3 = new NaiveEagerSingleton();

        SingletonUsage su = new SingletonUsage();
        su.getSomething();

        naiveEagerSingleton.setProperty("Property-value");
        System.out.println(naiveEagerSingleton2.getProperty());
    }

    private void getSomething(){
        System.out.println("Sample text to print");
    }
}

class NaiveEagerSingleton {

    private static NaiveEagerSingleton instance = new NaiveEagerSingleton();

    // private static final NaiveEagerSingleton instance = new NaiveEagerSingleton();

    private String property;

    // private constructor to avoid client applications to use constructor
    private NaiveEagerSingleton(){}

    public static NaiveEagerSingleton getInstance(){
        return instance;
    }

    public void setProperty(String prop) {
        this.property = prop;
    }

    public String getProperty() {
        return property;
    }
}