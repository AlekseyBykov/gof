//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.behavioral.template;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-05
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
