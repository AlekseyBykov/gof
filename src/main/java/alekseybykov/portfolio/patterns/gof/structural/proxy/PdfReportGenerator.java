package alekseybykov.portfolio.patterns.gof.structural.proxy;

/**
 * @author Aleksey Bykov
 * @since 05.11.2019
 */
public class PdfReportGenerator implements ReportGenerator {

    @Override
    public String generateReport(String data) {
        return data;
    }
}
