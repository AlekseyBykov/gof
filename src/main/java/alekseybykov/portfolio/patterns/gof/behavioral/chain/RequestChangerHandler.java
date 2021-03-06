package alekseybykov.portfolio.patterns.gof.behavioral.chain;

/**
 * @author Aleksey Bykov
 * @since 03.11.2019
 */
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
