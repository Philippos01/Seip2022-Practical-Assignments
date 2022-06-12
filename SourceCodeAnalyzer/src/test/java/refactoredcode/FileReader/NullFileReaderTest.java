package refactoredcode.FileReader;

import java.io.IOException;
import org.junit.Test;

/**
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */

public class NullFileReaderTest {

    File_Reader reader = new NullFileReader();

    @Test (expected = IllegalArgumentException.class)
    public void testReadFileIntoString() throws IOException {
        reader.ReadFileIntoString("--");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testReadFileIntoList() throws IOException {
        reader.ReadFileIntoList("--");
    }
}