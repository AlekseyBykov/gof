package alekseybykov.portfolio.patterns.gof.structural.adapter;

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
