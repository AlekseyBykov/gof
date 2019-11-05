//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.structural.proxy.custom;

import alekseybykov.portfolio.patterns.gof.structural.proxy.PdfReportGenerator;

import static java.lang.String.format;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-05
 */
public class ProxyReportGenerator extends PdfReportGenerator {

    @Override
    public String generateReport(String data) {
        return super.generateReport(format("#%s# %s #%s#", "start report", data, "end report"));
    }
}
