//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.structural.proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-05
 */
@DisplayName("Tests for Proxy Pattern")
class ProxyTest {

    private final String data = "report";

    @Test
    @DisplayName("Proxying the target method call")
    void testProxyingTheTargetMethodCall() {
        PdfReportGenerator reportGenerator = new ProxyReportGenerator();
        reportGenerator.generateReport(data);

        assertEquals(format("#%s# %s #%s#", "start report", data, "end report"),
                reportGenerator.generateReport(data));
    }

    @Test
    @DisplayName("Call target method without proxying")
    void testCallTargetMethodWithoutProxying() {
        PdfReportGenerator reportGenerator = new PdfReportGenerator();
        reportGenerator.generateReport(data);

        assertEquals(data, reportGenerator.generateReport(data));
    }
}
