package alekseybykov.portfolio.patterns.gof.creational.prototype.shallow;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 29.09.2019
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
