//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.singleton.threadsafe.lazy;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-28
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
