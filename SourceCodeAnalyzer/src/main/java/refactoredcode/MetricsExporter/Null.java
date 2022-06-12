package refactoredcode.MetricsExporter;

import java.util.Map;

/**
 *This class handles the null type throwing IllegalArgumentException.
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-06-11
 */

public class Null implements MetricsExporter {

    @Override
    public void ExportToFile(String filePath, Map<String, Integer> metrics) {
        throw new IllegalArgumentException("Cannot export null object");
    }

}