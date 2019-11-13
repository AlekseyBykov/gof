package alekseybykov.portfolio.patterns.gof.structural.proxy;

public class PdfReportGenerator implements ReportGenerator {

    @Override
    public String generateReport(String data) {
        return data;
    }
}
