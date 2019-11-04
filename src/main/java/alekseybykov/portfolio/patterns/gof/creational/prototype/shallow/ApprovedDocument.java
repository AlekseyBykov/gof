//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.creational.prototype.shallow;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-29
 */
public class ApprovedDocument extends Document {

    public ApprovedDocument clone() throws CloneNotSupportedException {
        return (ApprovedDocument) super.clone();
    }
}
