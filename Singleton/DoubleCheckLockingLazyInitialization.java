public class DoubleCheckLockingLazyInitialization {
    private static DoubleCheckLockingLazyInitialization instance;

    private DoubleCheckLockingLazyInitialization() {
        // private constructor
    }

    public static DoubleCheckLockingLazyInitialization getInstance() {
        // Performance overhead gets reduced because of synchronized keyword.
        if (checkWhetherInstanceIsCreatedOrNot()) {
            //synchronized block to remove overhead
            synchronized (DoubleCheckLockingLazyInitialization.class) {
                if (checkWhetherInstanceIsCreatedOrNot()) {
                    createLazyInitializationObject();
                }

            }
        }
        return instance;
    }

    private static void createLazyInitializationObject() {
        instance = new DoubleCheckLockingLazyInitialization();
    }

    private static boolean checkWhetherInstanceIsCreatedOrNot() {
        return instance == null;
    }

}
