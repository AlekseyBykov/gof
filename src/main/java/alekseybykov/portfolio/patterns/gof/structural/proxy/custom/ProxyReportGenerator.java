package alekseybykov.portfolio.patterns.gof.structural.proxy.custom;

import alekseybykov.portfolio.patterns.gof.structural.proxy.PdfReportGenerator;

import static java.lang.String.format;

public class ProxyReportGenerator extends PdfReportGenerator {

    @Override
    public String generateReport(String data) {
        return super.generateReport(format("#%s# %s #%s#", "start report", data, "end report"));
    }
}
