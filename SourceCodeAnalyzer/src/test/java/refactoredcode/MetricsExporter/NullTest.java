package sourcecodeanalyzerrefactored.metrciswriter;

import org.junit.Test;
import refactoredcode.MetricsExporter.Null;
import refactoredcode.MetricsExporter.MetricsExporter;

/**
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */

public class NullTest {
    MetricsExporter exporter = new Null();

    @Test (expected = IllegalArgumentException.class)
    public void testExportToFile() {
        exporter.ExportToFile("-", null);
    }


}