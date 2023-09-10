//used only in single threaded env as multi threaded env creates multiple objects
/*
-> Object is created only if it is needed. It may overcome wastage of resource and  CPU time.
-> Exception handling is also possible in method.
-> Every time a condition of null has to be checked.
-> instance can’t be accessed directly.
-> In multithreaded environment, it may break singleton property.
 */
public class LazyInitialization {
    // private instance, so that it can be
    // accessed by only by getInstance() method
    private static LazyInitialization instance;

    private LazyInitialization()
    {
        // private constructor
    }

    //method to return instance of class
    public static LazyInitialization getInstance()
    {
        if ( checkWhetherInstanceIsCreatedOrNot() )
        {
             createLazyInitializationObject();
        }
        return instance;
    }

    private static void createLazyInitializationObject() {
        instance = new LazyInitialization();
    }

    private static boolean checkWhetherInstanceIsCreatedOrNot() {
        return instance == null;
    }
}
