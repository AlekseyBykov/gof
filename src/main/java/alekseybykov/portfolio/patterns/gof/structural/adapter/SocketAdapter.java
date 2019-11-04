//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.structural.adapter;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
public class SocketAdapter implements HdmiSocket {

    private VgaSocket vgaSocket;

    public SocketAdapter(VgaSocket vgaSocket) {
        this.vgaSocket = vgaSocket;
    }

    @Override
    public String getVideoSignal() {
        return vgaSocket.getVideoSignal();
    }
}
