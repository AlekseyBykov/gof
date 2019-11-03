//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.chain;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
public class RequestAppenderHandler extends RequestHandler {

    public RequestAppenderHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(StringBuilder requestBuilder) {
        requestBuilder.append("request appended\n");
    }
}
