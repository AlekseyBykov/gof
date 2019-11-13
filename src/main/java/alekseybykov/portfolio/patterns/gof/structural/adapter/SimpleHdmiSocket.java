package alekseybykov.portfolio.patterns.gof.structural.adapter;

public class SimpleHdmiSocket implements HdmiSocket {
    @Override
    public String getVideoSignal() {
        return "Video signal: Maximum resolution limited by available bandwidth";
    }
}
