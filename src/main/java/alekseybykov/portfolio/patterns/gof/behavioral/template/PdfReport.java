package alekseybykov.portfolio.patterns.gof.behavioral.template;

/**
 * @author Aleksey Bykov
 * @since 05.11.2019
 */
public class PdfReport extends ReportTemplate {

    @Override
    public String setData() {
        return "PDF report data";
    }

    @Override
    public String setFormat() {
        return "PDF report format";
    }
}
