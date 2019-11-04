//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.behavioral.mediator;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-04
 */
public interface Broadcaster {

    void produceMessage(String message, Participant sender);

    void addParticipant(Participant participant);
}
