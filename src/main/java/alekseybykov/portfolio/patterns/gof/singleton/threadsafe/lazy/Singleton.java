//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.singleton.threadsafe.lazy;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-28
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() { }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
