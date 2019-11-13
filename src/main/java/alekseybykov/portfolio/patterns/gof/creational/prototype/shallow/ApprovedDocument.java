package alekseybykov.portfolio.patterns.gof.creational.prototype.shallow;

public class ApprovedDocument extends Document {

    public ApprovedDocument clone() throws CloneNotSupportedException {
        return (ApprovedDocument) super.clone();
    }
}
