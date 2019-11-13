package alekseybykov.portfolio.patterns.gof.structural.proxy;

import alekseybykov.portfolio.patterns.gof.structural.proxy.custom.ProxyReportGenerator;
import alekseybykov.portfolio.patterns.gof.structural.proxy.embedded.ProxyInvocationHandler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for Proxy Pattern")
class ProxyTest {

    private final String data = "report";

    @Test
    @DisplayName("Proxying the target method call with using custom proxy")
    void testProxyingTheTargetMethodCall() {
        PdfReportGenerator reportGenerator = new ProxyReportGenerator();
        reportGenerator.generateReport(data);

        assertEquals(format("#%s# %s #%s#", "start report", data, "end report"),
                reportGenerator.generateReport(data));
    }

    @Test
    @DisplayName("Proxying the target method call with using embedded in JDK proxy")
    void testProxyingTheTargetMethodCallUsingNativeProxy() {
        InvocationHandler invocationHandler = new ProxyInvocationHandler();
        Object proxyInstance = Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),
                new Class[] {ReportGenerator.class}, invocationHandler);

        assertEquals(format("#%s# %s #%s#", "start report", data, "end report"),
                ((ReportGenerator)proxyInstance).generateReport(data));
    }

    @Test
    @DisplayName("Call target method without proxying")
    void testCallTargetMethodWithoutProxying() {
        PdfReportGenerator reportGenerator = new PdfReportGenerator();
        reportGenerator.generateReport(data);

        assertEquals(data, reportGenerator.generateReport(data));
    }
}
