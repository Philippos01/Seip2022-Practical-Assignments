package refactoredcode.MetricsExporter;

import org.junit.Test;

import refactoredcode.MetricsExporter.JSON;
import refactoredcode.MetricsExporter.MetricsExporter;

public class JSONTest {
    MetricsExporter exporter = new JSON();

    @Test (expected = IllegalArgumentException.class)
    public void testExportToFile() {
        exporter.ExportToFile("any-file-path", null);
    }

}