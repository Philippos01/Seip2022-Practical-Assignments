package refactoredcode.FileReader;

import java.util.List;

/**
 * This class handles the null type of file throwing IllegalArgumentException.
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */

public class NullFileReader implements File_Reader {

    @Override
    public String ReadFileIntoString(String filePath) {
        throw new IllegalArgumentException("Cannot read null object");
    }

    @Override
    public List<String> ReadFileIntoList(String filePath) {
        throw new IllegalArgumentException("Cannot read null object");
    }

}