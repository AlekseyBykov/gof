package alekseybykov.portfolio.patterns.gof.creational.singleton.threadsafe.lazy;

/**
 * @author Aleksey Bykov
 * @since 29.09.2019
 */
final class LazyInitSingleton {

    private static LazyInitSingleton singleton;

    static int numberOfInstances = 0;

    private LazyInitSingleton() {
        numberOfInstances++;
    }

    public static synchronized LazyInitSingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazyInitSingleton();
        }
        return singleton;
    }

    static void checkForLazyInit() {
        System.out.println("Singleton instance is not created");
    }
}
