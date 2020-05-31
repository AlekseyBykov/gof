package alekseybykov.portfolio.patterns.gof.creational.prototype.shallow;

/**
 * @author Aleksey Bykov
 * @since 29.09.2019
 */
public class DraftDocument extends Document {

    public DraftDocument clone() throws CloneNotSupportedException {
        return (DraftDocument) super.clone();
    }
}
