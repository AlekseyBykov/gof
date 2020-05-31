package alekseybykov.portfolio.patterns.gof.creational.singleton.threadsafe.eager;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 29.09.2019
 */
@DisplayName("Tests for Singleton Pattern implementation with eager loading")
class EagerInitSingletonTest {

    @Test
    @DisplayName("Call method with singleton instantiation")
    void testEagerInitialization() {
        EagerInitSingleton.checkForEagerInit();
        assertEquals(EagerInitSingleton.numberOfInstances, 1);
    }
}
