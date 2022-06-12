package refactoredcode.FileReader;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class LocalFileReaderTest {

    private static List<String> expectedList;
    private static String expectedString;
    private final static String TEST_CLASS_LOCAL = "src/test/resources/TestClass.java";

    @BeforeClass
    public static void setUp() throws IOException {
        expectedList = Files.readAllLines(new File(TEST_CLASS_LOCAL).toPath(), Charset.defaultCharset());
        expectedString = String.join("\n", expectedList) + "\n"; // transforms a list into a String (with 'new line' as delimiter)
    }

    File_Reader reader = new LocalFileReader();

    @Test
    public void testReadFileIntoString() throws IOException {
        //read a locally stored file into a String
        String actuals = reader.ReadFileIntoString(TEST_CLASS_LOCAL);
        assertEquals(expectedString, actuals);
    }

    @Test
    public void testReadFileIntoList() throws IOException {
        List<String> actualList = reader.ReadFileIntoList(TEST_CLASS_LOCAL);

        String[] expecteds = expectedList.stream().toArray(String[]::new);
        String[] actuals = actualList.stream().toArray(String[]::new);

        assertArrayEquals(expecteds, actuals);
    }

}