package refactoredcode.MetricsExporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Formats and exports metrics(LOC,NOM,NOC) into a CSV file
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-06-11
 */

public class CSV implements MetricsExporter {

    @Override
    public void ExportToFile(String filePath, Map<String, Integer> metrics) {
        File outputFile = new File(filePath + ".csv");
        StringBuilder metricsNames = new StringBuilder();
        StringBuilder metricsValues = new StringBuilder();

        for (Map.Entry<String, Integer> entry : metrics.entrySet()) {
            metricsNames.append(entry.getKey() + ",");
            metricsValues.append(entry.getValue() + ",");
        }

        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.append(metricsNames + "\n");
            writer.append(metricsValues + "\n");
            writer.close();
            System.out.println("Metrics saved in " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}