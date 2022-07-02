package refactoredcode.analyzer;

import org.junit.Test;

import refactoredcode.FileReader.File_Reader;
import refactoredcode.FileReader.LocalFileReader;
import static org.junit.Assert.*;

/**
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */

public class SourceCodeAnalyzerTest {

    @Test
    public void testSetFileReader() {
        SourceCodeAnalyzer analyzer = new StringCompAnalyzer();
        File_Reader expectedReader = new LocalFileReader();

        analyzer.setFileReader(expectedReader);
        File_Reader actualReader = analyzer.getFileReader();

        assertSame(expectedReader, actualReader);
    }
}