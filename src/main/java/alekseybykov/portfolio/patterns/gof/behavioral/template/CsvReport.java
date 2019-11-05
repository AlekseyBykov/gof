//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.behavioral.template;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-05
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
