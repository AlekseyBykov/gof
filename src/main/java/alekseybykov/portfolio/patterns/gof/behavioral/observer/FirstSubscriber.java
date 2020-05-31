package alekseybykov.portfolio.patterns.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Bykov
 * @since 04.11.2019
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
