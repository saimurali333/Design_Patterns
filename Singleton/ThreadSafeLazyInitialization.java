
//getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously

public class ThreadSafeLazyInitialization {

    private static ThreadSafeLazyInitialization instance;

    private ThreadSafeLazyInitialization() {

    }
    //synchronized method to control simultaneous access
    synchronized public static ThreadSafeLazyInitialization getInstance() {
        if(checkWhetherInstanceIsCreatedOrNot()){
            createLazyInitializationObject();
        }
        return instance;
    }

    private static void createLazyInitializationObject() {
        instance = new ThreadSafeLazyInitialization();
    }

    private static boolean checkWhetherInstanceIsCreatedOrNot() {
        return instance == null;
    }
}
