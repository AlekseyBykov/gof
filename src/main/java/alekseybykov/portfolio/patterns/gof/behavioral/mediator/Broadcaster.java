package alekseybykov.portfolio.patterns.gof.behavioral.mediator;

/**
 * @author Aleksey Bykov
 * @since 04.11.2019
 */
public interface Broadcaster {

    void produceMessage(String message, Participant sender);

    void addParticipant(Participant participant);
}
