package sourcecodeanalyzerrefactored.metrciswriter;

import org.junit.Test;

import refactoredcode.MetricsExporter.Null;
import refactoredcode.MetricsExporter.MetricsExporter;

public class NullTest {
    MetricsExporter exporter = new Null();

    @Test (expected = IllegalArgumentException.class)
    public void testExportToFile() {
        exporter.ExportToFile("-", null);
    }


}