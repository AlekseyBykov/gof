package alekseybykov.portfolio.patterns.gof.behavioral.template;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Aleksey Bykov
 * @since 05.11.2019
 */
@DisplayName("Tests for Template Pattern")
class TemplateTest {

    @Test
    @DisplayName("Using template method with parts implemented in subclasses for generating CSV report")
    void testCreateCSVReport() {
        ReportTemplate report = new CsvReport();
        report.createReport();
        assertThat(report.getReport(), hasItems("Common report title", "Common report header",
                "CSV report data", "CSV report format", "Common report footer"));
    }

    @Test
    @DisplayName("Using template method with parts implemented in subclasses for generating PDF report")
    void testCreatePDFReport() {
        ReportTemplate report = new PdfReport();
        report.createReport();
        assertThat(report.getReport(), hasItems("Common report title", "Common report header",
                "PDF report data", "PDF report format", "Common report footer"));
    }
}
