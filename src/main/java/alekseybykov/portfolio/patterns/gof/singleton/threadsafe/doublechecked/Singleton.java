//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.singleton.threadsafe.doublechecked;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-28
 */
final class Singleton {

    private static Singleton singleton;

    private Singleton() { }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
