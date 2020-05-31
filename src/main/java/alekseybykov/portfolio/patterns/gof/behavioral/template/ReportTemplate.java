package alekseybykov.portfolio.patterns.gof.behavioral.template;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Aleksey Bykov
 * @since 05.11.2019
 */
public abstract class ReportTemplate {

    private Set<String> report = new LinkedHashSet<>();

    public final void createReport(){
        report.add(setTitle());
        report.add(setHeader());
        report.add(setData());
        report.add(setFormat());
        report.add(setFooter());
    }

    private String setTitle() {
        return "Common report title";
    }

    private String setHeader() {
        return "Common report header";
    }

    private String setFooter() {
        return "Common report footer";
    }

    public abstract String setData();
    public abstract String setFormat();

    public Set<String> getReport() {
        return report;
    }
}
