//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.adapter;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
public class SimpleVgaSocket implements VgaSocket {
    @Override
    public String getVideoSignal() {
        return "Video signal: RGB plus option H and V sync";
    }
}
