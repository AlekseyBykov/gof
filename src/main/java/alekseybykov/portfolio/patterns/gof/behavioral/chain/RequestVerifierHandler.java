package alekseybykov.portfolio.patterns.gof.behavioral.chain;

public class RequestVerifierHandler extends RequestHandler {

    public RequestVerifierHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(StringBuilder requestBuilder) {
        requestBuilder.append("request verified\n");
        requestHandler.handleRequest(requestBuilder);
    }
}
