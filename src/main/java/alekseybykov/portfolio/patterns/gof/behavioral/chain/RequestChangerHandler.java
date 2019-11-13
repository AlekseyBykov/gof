package alekseybykov.portfolio.patterns.gof.behavioral.chain;

public class RequestChangerHandler extends RequestHandler {

    public RequestChangerHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(StringBuilder requestBuilder) {
        requestBuilder.append("request changed\n");
        requestHandler.handleRequest(requestBuilder);
    }
}
