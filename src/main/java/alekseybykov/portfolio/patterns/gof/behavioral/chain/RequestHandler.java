//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.behavioral.chain;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
abstract class RequestHandler {

    RequestHandler requestHandler;

    public RequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public abstract void handleRequest(StringBuilder requestBuilder);
}
