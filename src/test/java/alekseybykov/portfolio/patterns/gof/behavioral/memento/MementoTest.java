package alekseybykov.portfolio.patterns.gof.behavioral.memento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 04.11.2019
 */
@DisplayName("Tests for Memento Pattern")
class MementoTest {

    @Test
    @DisplayName("Save entity state and restore")
    void testSaveEntityStateAndRestore() {
        List<EntityWithState.Memento> states = new ArrayList<>();
        EntityWithState entityWithState = new EntityWithState();

        entityWithState.setState("First state");
        entityWithState.setState("Second state");
        states.add(entityWithState.saveState());
        entityWithState.setState("Third state");

        assertEquals(entityWithState.getState(), "Third state");

        entityWithState.restoreState(states.get(0));

        assertEquals(entityWithState.getState(), "Second state");
    }
}