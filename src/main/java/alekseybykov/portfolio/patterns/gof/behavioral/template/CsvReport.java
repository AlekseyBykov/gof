package alekseybykov.portfolio.patterns.gof.behavioral.template;

/**
 * @author Aleksey Bykov
 * @since 05.11.2019
 */
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
