//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.creational.prototype.shallow;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-29
 */
@DisplayName("Tests for Prototype Pattern implementation with shallow copying of fields")
class ShallowPrototypeTest {

    @Test
    @DisplayName("Create new object and clone it by using field-by-field copying")
    void testPrototypeWithShallowCopying() throws CloneNotSupportedException {

        DraftDocument draftDocument = new DraftDocument();
        draftDocument.setId(NumberUtils.LONG_ZERO);
        draftDocument.setContent("draft document");

        assertEquals(draftDocument.clone().getId(), draftDocument.getId());
        assertEquals(draftDocument.clone().getContent(), draftDocument.getContent());
    }
}
