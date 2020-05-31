package alekseybykov.portfolio.patterns.gof.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Aleksey Bykov
 * @since 04.11.2019
 */
public class BroadcasterMediator implements Broadcaster {

    private List<Participant> participants = new ArrayList<>();

    @Override
    public void produceMessage(String message, Participant sender) {
        participants.forEach(participant -> {
            if (!Objects.equals(sender, participant)) {
                participant.receiveMessage(message);
            }
        });
    }

    @Override
    public void addParticipant(Participant participant) {
        participants.add(participant);
    }
}
