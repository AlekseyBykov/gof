//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.creational.singleton.threadsafe.eager;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-28
 */
final class EagerInitSingleton {

    static int numberOfInstances = 0;

    private static final EagerInitSingleton singleton = new EagerInitSingleton();

    private EagerInitSingleton() {
        numberOfInstances++;
    }

    public static EagerInitSingleton getSingleton() {
        return singleton;
    }

    static void checkForEagerInit() {
        System.out.println("Singleton instance is created");
    }
}
