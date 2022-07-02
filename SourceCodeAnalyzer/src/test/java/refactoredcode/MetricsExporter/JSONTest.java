package refactoredcode.MetricsExporter;

import org.junit.Test;
import refactoredcode.MetricsExporter.JSON;
import refactoredcode.MetricsExporter.MetricsExporter;

/**
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */

public class JSONTest {
    MetricsExporter exporter = new JSON();

    @Test (expected = IllegalArgumentException.class)
    public void testExportToFile() {
        exporter.ExportToFile("---", null);
    }

}