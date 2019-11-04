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
public class FirstSubscriber implements Observable {

    private List<String> announces = new ArrayList<>();

    @Override
    public void receiveAnnounce(String message) {
        announces.add(message);
    }

    public List<String> getAnnounces() {
        return announces;
    }
}
