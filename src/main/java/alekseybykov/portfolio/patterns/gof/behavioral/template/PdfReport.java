package alekseybykov.portfolio.patterns.gof.behavioral.template;

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
