//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.singleton.threadunsafe;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-28
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
final class ThreadUnsafeSingleton {

    private static ThreadUnsafeSingleton singleton;

    public static ThreadUnsafeSingleton getSingleton() {
        if (singleton == null) {
            singleton = new ThreadUnsafeSingleton();
        }
        return singleton;
    }
}
