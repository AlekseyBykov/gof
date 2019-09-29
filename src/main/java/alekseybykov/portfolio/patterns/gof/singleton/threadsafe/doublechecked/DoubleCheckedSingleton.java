//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.singleton.threadsafe.doublechecked;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-28
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
final class DoubleCheckedSingleton {

    private static DoubleCheckedSingleton singleton;

    public static DoubleCheckedSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedSingleton();
                }
            }
        }
        return singleton;
    }
}
