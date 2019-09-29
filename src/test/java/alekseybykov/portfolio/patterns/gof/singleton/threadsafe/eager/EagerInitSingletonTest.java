//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.singleton.threadsafe.eager;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-29
 */
@DisplayName("Tests for singleton implementation with eager loading")
class EagerInitSingletonTest {

    @Test
    @DisplayName("Call method with singleton instantiation")
    void testEagerInitialization() {
        EagerInitSingleton.checkForEagerInit();
        assertEquals(EagerInitSingleton.numberOfInstances, 1);
    }
}
