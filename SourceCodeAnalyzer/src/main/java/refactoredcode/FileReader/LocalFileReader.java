package refactoredcode.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads a local file and returns its content as a single String or a list of Strings.
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */

public class LocalFileReader implements File_Reader {

    @Override
    public String ReadFileIntoString(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line + "\n");
        }
        reader.close();
        return sb.toString();
    }

    @Override
    public List<String> ReadFileIntoList(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        return lines;
    }

}