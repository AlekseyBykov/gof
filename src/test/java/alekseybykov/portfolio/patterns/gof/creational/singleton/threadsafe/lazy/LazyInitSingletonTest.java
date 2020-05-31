package alekseybykov.portfolio.patterns.gof.creational.singleton.threadsafe.lazy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 29.09.2019
 */
@DisplayName("Tests for Singleton Pattern implementation with lazy loading")
class LazyInitSingletonTest {

    @Test
    @DisplayName("Call method without singleton instantiation")
    void testEagerInitialization() {
        LazyInitSingleton.checkForLazyInit();
        assertEquals(LazyInitSingleton.numberOfInstances, 0);
    }
}
