//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.singleton.threadsafe.lazy;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-28
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
final class LazyInitSingleton {

    private static LazyInitSingleton singleton;

    public static synchronized LazyInitSingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazyInitSingleton();
        }
        return singleton;
    }
}
