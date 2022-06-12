package refactoredcode.FileReader;

import java.io.IOException;

import org.junit.Test;

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