//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.prototype.shallow;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-09-29
 */
public class DraftDocument extends Document {

    public DraftDocument clone() throws CloneNotSupportedException {
        return (DraftDocument) super.clone();
    }
}
