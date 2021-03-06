package alekseybykov.portfolio.patterns.gof.behavioral.memento;

/**
 * @author Aleksey Bykov
 * @since 04.11.2019
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
