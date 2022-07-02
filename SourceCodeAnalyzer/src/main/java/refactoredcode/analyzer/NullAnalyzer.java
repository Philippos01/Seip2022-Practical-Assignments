package refactoredcode.analyzer;

import java.io.IOException;

/**
 * This class handles the null type of SourceCodeAnalyzer throwing IllegalArgumentException.
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
  */

public class NullAnalyzer extends SourceCodeAnalyzer {

    @Override
    public int calculateLOC(String filepath) throws IOException {
        throw new IllegalArgumentException("Cannot Analyze Null Object");
    }

    @Override
    public int calculateNOM(String filepath) throws IOException {
        throw new IllegalArgumentException("Cannot Analyze Null Object");
    }

    @Override
    public int calculateNOC(String filepath) throws IOException {
        throw new IllegalArgumentException("Cannot Analyze Null Object");
    }

}