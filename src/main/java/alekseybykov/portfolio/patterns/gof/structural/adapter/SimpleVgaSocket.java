package alekseybykov.portfolio.patterns.gof.structural.adapter;

/**
 * @author Aleksey Bykov
 * @since 03.11.2019
 */
public class SimpleVgaSocket implements VgaSocket {
    @Override
    public String getVideoSignal() {
        return "Video signal: RGB plus option H and V sync";
    }
}
