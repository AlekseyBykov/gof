//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.behavioral.chain;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
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
