//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.memento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-04
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