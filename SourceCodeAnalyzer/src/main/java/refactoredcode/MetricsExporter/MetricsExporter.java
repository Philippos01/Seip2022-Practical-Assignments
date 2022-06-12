package refactoredcode.MetricsExporter;

import java.util.Map;

/**
 * Defines the methods that can be implemented by the other MetricsExporter classes
 * in order to format and export the output into the right file.
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-06-11
 */

public interface MetricsExporter {

    public void ExportToFile(String filePath, Map<String,Integer> metrics);

}