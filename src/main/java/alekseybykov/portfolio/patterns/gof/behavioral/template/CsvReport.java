package alekseybykov.portfolio.patterns.gof.behavioral.template;

public class CsvReport extends ReportTemplate {

    @Override
    public String setData() {
        return "CSV report data";
    }

    @Override
    public String setFormat() {
        return "CSV report format";
    }
}
