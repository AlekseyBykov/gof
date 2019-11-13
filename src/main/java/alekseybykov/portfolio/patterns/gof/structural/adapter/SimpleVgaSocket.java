package alekseybykov.portfolio.patterns.gof.structural.adapter;

public class SimpleVgaSocket implements VgaSocket {
    @Override
    public String getVideoSignal() {
        return "Video signal: RGB plus option H and V sync";
    }
}
