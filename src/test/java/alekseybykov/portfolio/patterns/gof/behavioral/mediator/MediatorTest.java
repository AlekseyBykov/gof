//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.behavioral.mediator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-04
 */
@DisplayName("Tests for Mediator Pattern")
class MediatorTest {

    @Test
    @DisplayName("Send a message to others through the mediator")
    void testSendMsgToOtherParticipantsThroughMediator() {
        Broadcaster broadcaster = new BroadcasterMediator();

        Participant firstParticipant = new Participant(broadcaster, "firstParticipant");
        Participant secondParticipant = new Participant(broadcaster, "secondParticipant");
        Participant thirdParticipant = new Participant(broadcaster, "thirdParticipant");

        broadcaster.addParticipant(firstParticipant);
        broadcaster.addParticipant(secondParticipant);
        broadcaster.addParticipant(thirdParticipant);

        firstParticipant.produceMessage("MESSAGE");

        assertTrue(firstParticipant.getReceivedMessages().isEmpty());
        assertEquals("Message \'MESSAGE\' received by secondParticipant",
                secondParticipant.getReceivedMessages().get(0));
        assertEquals("Message \'MESSAGE\' received by thirdParticipant",
                thirdParticipant.getReceivedMessages().get(0));
    }
}
