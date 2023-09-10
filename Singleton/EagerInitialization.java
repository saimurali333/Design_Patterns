/*
        1. Very simple to implement.
        2. May lead to resource wastage. Because instance of class is created always, whether it is required or not.
        3. CPU time is also wasted in creation of instance if it is not required.
        4. Exception handling is not possible.
 */

public class EagerInitialization {
    // public instance initialized when loading the class
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization()
    {
        // private constructor
    }
    public static EagerInitialization getInstance(){
        return instance;
    }
    /*static
    {
        // static block to initialize instance
        instance = new GFG();
    }*/
}
