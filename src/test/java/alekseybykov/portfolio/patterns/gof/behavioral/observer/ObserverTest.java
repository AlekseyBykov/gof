//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.behavioral.observer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-04
 */
@DisplayName("Tests for Observer Pattern")
class ObserverTest {

    @Test
    @DisplayName("Create a subscription and notify all the subscribers")
    void testCreateSubscribersAndNotifyAll() {
        Subject subject = new Subject();

        FirstSubscriber firstSubscriber = new FirstSubscriber();
        SecondSubscriber secondSubscriber = new SecondSubscriber();

        subject.subscribe(firstSubscriber);
        subject.subscribe(secondSubscriber);

        subject.announce("Announce");

        assertEquals("Announce", firstSubscriber.getAnnounces().get(0));
        assertEquals("Announce", secondSubscriber.getAnnounces().get(0));
    }
}
