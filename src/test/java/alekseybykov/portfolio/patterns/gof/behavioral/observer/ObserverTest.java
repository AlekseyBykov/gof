package alekseybykov.portfolio.patterns.gof.behavioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Aleksey Bykov
 * @since 04.11.2019
 */
@DisplayName("Tests for Observer Pattern")
class ObserverTest {

    private Subject subject;
    private FirstSubscriber firstSubscriber;
    private SecondSubscriber secondSubscriber;

    @BeforeEach
    void init() {
        subject = new Subject();
        firstSubscriber = new FirstSubscriber();
        secondSubscriber = new SecondSubscriber();
    }

    @Test
    @DisplayName("Create a subscription and notify all the subscribers")
    void testCreateSubscribersAndNotifyAll() {

        subject.subscribe(firstSubscriber);
        subject.subscribe(secondSubscriber);

        subject.announce("Announce");

        assertEquals("Announce", firstSubscriber.getAnnounces().get(0));
        assertEquals("Announce", secondSubscriber.getAnnounces().get(0));
    }

    @Test
    @DisplayName("Unsubscribe one and notify all the subscribers")
    void testUnsubscribeOneAndNotifyAll() {

        subject.subscribe(firstSubscriber);
        subject.subscribe(secondSubscriber);

        subject.announce("Announce");

        assertEquals("Announce", firstSubscriber.getAnnounces().get(0));
        assertEquals("Announce", secondSubscriber.getAnnounces().get(0));

        subject.unsubscribe(secondSubscriber);

        subject.announce("Yet another announce");

        assertTrue(secondSubscriber.getAnnounces().size() == 1);
        assertEquals("Announce", secondSubscriber.getAnnounces().get(0));
        assertEquals("Announce", firstSubscriber.getAnnounces().get(0));
        assertEquals("Yet another announce", firstSubscriber.getAnnounces().get(1));
    }
}
