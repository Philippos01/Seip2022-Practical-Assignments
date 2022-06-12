package refactoredcode.analyzer;

import java.io.IOException;

import org.junit.Test;

public class NullAnalyzerTest {
    private SourceCodeAnalyzer analyzer = new NullAnalyzer();

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateLOC() throws IOException {
        analyzer.calculateLOC("-");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculatNOM() throws IOException {
        analyzer.calculateNOM("-");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateNOC() throws IOException {
        analyzer.calculateNOC("-");
    }
}