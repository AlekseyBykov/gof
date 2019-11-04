//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-04
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
