//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.behavioral.chain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
@DisplayName("Tests for Chain of responsibility Pattern")
class ChainOfResponsibilityTest {

    @Test
    @DisplayName("Pass and change object through the chain of receivers")
    void testPassingAndChangingObjectThroughTheChain() {
        RequestHandler requestHeadersAppender = new RequestVerifierHandler(
            new RequestChangerHandler(new RequestAppenderHandler(null)));

        StringBuilder request = new StringBuilder("request\n");

        requestHeadersAppender.handleRequest(request);

        assertEquals(
                "request\n" +
                "request verified\n" +
                "request changed\n" +
                "request appended\n", request.toString());
    }
}
