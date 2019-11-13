package alekseybykov.portfolio.patterns.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SecondSubscriber implements Observable {

    private List<String> announces = new ArrayList<>();

    @Override
    public void receiveAnnounce(String message) {
        announces.add(message);
    }

    public List<String> getAnnounces() {
        return announces;
    }
}
