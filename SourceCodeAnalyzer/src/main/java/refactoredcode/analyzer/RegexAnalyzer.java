package refactoredcode.analyzer;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import refactoredcode.FileReader.*;

/**
 * This class calculates source code metrics through Regex(Regular Expressions).
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */
public class RegexAnalyzer extends SourceCodeAnalyzer {

    LocalFileReader filereader= new LocalFileReader();

    @Override
    public int calculateLOC(String filepath) throws IOException {
        String sourceCode = filereader.ReadFileIntoString(filepath);
        Pattern pattern = Pattern.compile("((//.*)|(/\\*.*)|(\\*+.*))");
        Matcher nonCodeLinesMatcher = pattern.matcher(sourceCode);

        int nonCodeLinesCounter = 0;
        while (nonCodeLinesMatcher.find()) {
            nonCodeLinesCounter++;
        }

        int sourceFileLength = sourceCode.split("\n").length;
        int loc = sourceFileLength - nonCodeLinesCounter;

        return loc;
    }

    @Override
    public int calculateNOM(String filepath) throws IOException {
        String sourceCode = filereader.ReadFileIntoString(filepath);
        Pattern pattern = Pattern.compile(
                ".*(public |protected |private |static )?[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;]).*");
        Matcher methodSignatures = pattern.matcher(sourceCode);

        int methodCounter = 0;
        while (methodSignatures.find()) {
            methodCounter++;
        }
        return methodCounter;
    }

    @Override
    public int calculateNOC(String filepath) throws IOException {
        String sourceCode = filereader.ReadFileIntoString(filepath);
        Pattern pattern = Pattern.compile(".*\\s*class\\s+.*");
        Matcher classSignatures = pattern.matcher(sourceCode);

        int classCounter = 0;
        while (classSignatures.find()) {
            classCounter++;
        }
        return classCounter;
    }

}