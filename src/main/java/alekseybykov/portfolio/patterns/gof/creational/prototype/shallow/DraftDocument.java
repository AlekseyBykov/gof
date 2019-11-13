package alekseybykov.portfolio.patterns.gof.creational.prototype.shallow;

public class DraftDocument extends Document {

    public DraftDocument clone() throws CloneNotSupportedException {
        return (DraftDocument) super.clone();
    }
}
