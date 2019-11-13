package alekseybykov.portfolio.patterns.gof.behavioral.mediator;

public interface Broadcaster {

    void produceMessage(String message, Participant sender);

    void addParticipant(Participant participant);
}
