//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.behavioral.chain;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
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
