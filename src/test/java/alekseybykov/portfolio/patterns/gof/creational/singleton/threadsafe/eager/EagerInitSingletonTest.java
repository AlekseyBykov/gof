package alekseybykov.portfolio.patterns.gof.creational.singleton.threadsafe.eager;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for Singleton Pattern implementation with eager loading")
class EagerInitSingletonTest {

    @Test
    @DisplayName("Call method with singleton instantiation")
    void testEagerInitialization() {
        EagerInitSingleton.checkForEagerInit();
        assertEquals(EagerInitSingleton.numberOfInstances, 1);
    }
}
