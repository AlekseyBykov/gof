//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.structural.proxy;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-05
 */
public class PdfReportGenerator implements ReportGenerator {

    @Override
    public String generateReport(String data) {
        return data;
    }
}
