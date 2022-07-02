package refactoredcode.MetricsExporter;

import java.util.Map;

/**
 * Formats and exports metrics(LOC,NOM,NOC) into a JSON file
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-06-11
 */

public class JSON implements MetricsExporter {

    @Override
    public void ExportToFile(String filePath, Map<String, Integer> metrics) {
        throw new IllegalArgumentException("JSON type is not implemented");
    }

}