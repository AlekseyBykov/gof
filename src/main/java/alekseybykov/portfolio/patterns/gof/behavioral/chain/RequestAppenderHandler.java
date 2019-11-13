package alekseybykov.portfolio.patterns.gof.behavioral.chain;

public class RequestAppenderHandler extends RequestHandler {

    public RequestAppenderHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(StringBuilder requestBuilder) {
        requestBuilder.append("request appended\n");
    }
}
