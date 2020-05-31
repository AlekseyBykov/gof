package alekseybykov.portfolio.patterns.gof.structural.adapter;

/**
 * @author Aleksey Bykov
 * @since 03.11.2019
 */
public class SimpleHdmiSocket implements HdmiSocket {
    @Override
    public String getVideoSignal() {
        return "Video signal: Maximum resolution limited by available bandwidth";
    }
}
