package alekseybykov.portfolio.patterns.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Bykov
 * @since 04.11.2019
 */
public class Subject {

    private List<Observable> subscribers = new ArrayList<>();

    public void subscribe(Observable subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Observable subscriber) {
        subscribers.remove(subscriber);
    }

    public void announce(String message) {
        subscribers.forEach(subscriber -> subscriber.receiveAnnounce(message));
    }
}
