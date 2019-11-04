//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.memento;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-04
 */
public class EntityWithState {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveState() {
        return new Memento(this.state);
    }

    public void restoreState(Memento memento) {
        this.state = memento.state;
    }

    static class Memento {
        String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}