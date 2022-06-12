package refactoredcode.analyzer;

import org.junit.Test;

import refactoredcode.FileReader.File_Reader;
import refactoredcode.FileReader.LocalFileReader;
import static org.junit.Assert.*;

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