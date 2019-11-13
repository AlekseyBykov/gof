package alekseybykov.portfolio.patterns.gof.behavioral.chain;

abstract class RequestHandler {

    RequestHandler requestHandler;

    public RequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public abstract void handleRequest(StringBuilder requestBuilder);
}
