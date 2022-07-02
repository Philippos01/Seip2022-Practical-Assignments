package refactoredcode.FileReader;

import java.io.IOException;
import java.util.List;

/**
 * Defines the methods that can be implemented by the other Reader classes in order to
 * read a file and return its content as a single String or a list of Strings.
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */

public interface File_Reader {

    public String ReadFileIntoString(String filePath) throws IOException;

    public List<String> ReadFileIntoList(String filePath) throws IOException;

}