package alekseybykov.portfolio.patterns.gof.behavioral.chain;

/**
 * @author Aleksey Bykov
 * @since 03.11.2019
 */
abstract class RequestHandler {

    RequestHandler requestHandler;

    public RequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public abstract void handleRequest(StringBuilder requestBuilder);
}
