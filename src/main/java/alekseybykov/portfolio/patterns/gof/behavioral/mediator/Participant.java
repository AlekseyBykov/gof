package alekseybykov.portfolio.patterns.gof.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Aleksey Bykov
 * @since 04.11.2019
 */
public class Participant {

    private List<String> receivedMessages;
    private Broadcaster topic;
    private String name;

    public Participant(Broadcaster topic, String name) {
        this.topic = topic;
        this.name = name;

        receivedMessages = new ArrayList<>();
    }

    void produceMessage(String message) {
        topic.produceMessage(message, this);
    }

    void receiveMessage(String message) {
        receivedMessages.add(String.format("Message \'%s\' received by %s", message, name));
    }

    public List<String> getReceivedMessages() {
        return receivedMessages;
    }

    // only for significant field
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Participant)) return false;
        Participant that = (Participant) o;
        return Objects.equals(name, that.name);
    }

    // only for significant field
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
