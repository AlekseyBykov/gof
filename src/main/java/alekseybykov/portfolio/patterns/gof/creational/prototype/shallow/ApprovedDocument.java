package alekseybykov.portfolio.patterns.gof.creational.prototype.shallow;

/**
 * @author Aleksey Bykov
 * @since 29.09.2019
 */
public class ApprovedDocument extends Document {

    public ApprovedDocument clone() throws CloneNotSupportedException {
        return (ApprovedDocument) super.clone();
    }
}
