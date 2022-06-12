package refactoredcode.analyzer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import refactoredcode.FileReader.File_Reader;

public class StringCompAnalyzerTest {
    private SourceCodeAnalyzer analyzer = new StringCompAnalyzer();
    private static String TEST_FILEPATH = "src/test/resources/TestClass.java";
    private List<String> EXPECTED_SOURCELIST;

    private File_Reader filereader = mock(File_Reader.class);

    public StringCompAnalyzerTest() {
        try {
            EXPECTED_SOURCELIST = readTestFileContentIntoList(TEST_FILEPATH);
            when(filereader.ReadFileIntoList(TEST_FILEPATH)).thenReturn(EXPECTED_SOURCELIST);
            analyzer.setFileReader(filereader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testCalculateLOC() throws IOException {
        int expectedLoc = 7;
        int actualLoc = analyzer.calculateLOC(TEST_FILEPATH);
        assertEquals(expectedLoc, actualLoc);
    }

    @Test
    public void testCalculateNOM() throws IOException {
        int expectedNom = 3;
        int actualNom = analyzer.calculateNOM(TEST_FILEPATH);
        assertEquals(expectedNom, actualNom);
    }

    @Test
    public void testCalculateNOC() throws IOException {
        int expectedNoc = 3;
        int actualNoc = analyzer.calculateNOC(TEST_FILEPATH);
        assertEquals(expectedNoc, actualNoc);
    }
    private List<String> readTestFileContentIntoList(String filepath) throws IOException {
        List<String> sourceCodeLines;
        try (Stream<String> lines = Files.lines(Paths.get(filepath))) {
            sourceCodeLines = lines.collect(Collectors.toList());
        }
        return sourceCodeLines;
    }

}

