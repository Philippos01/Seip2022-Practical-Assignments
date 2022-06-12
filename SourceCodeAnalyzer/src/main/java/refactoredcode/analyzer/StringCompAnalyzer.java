package refactoredcode.analyzer;

import java.io.IOException;
import java.util.List;
import refactoredcode.FileReader.*;

/**
 * This class calculates source code metrics through String Comparison
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */

public class StringCompAnalyzer extends SourceCodeAnalyzer {

        LocalFileReader filereader= new LocalFileReader();

    @Override
    public int calculateLOC(String filepath) throws IOException {
        List<String> sourceCodeList = filereader.ReadFileIntoList(filepath);
        int nonCodeLinesCounter = 0;
        for (String line : sourceCodeList) {
            line = line.trim(); // clear all leading and trailing white spaces
            if (line.startsWith("//") || line.startsWith("/*") || line.startsWith("*") || line.equals("{")
                    || line.equals("}") || line.equals(""))
                nonCodeLinesCounter++;
        }
        int loc = sourceCodeList.size() - nonCodeLinesCounter;
        return loc;
    }

    @Override
    public int calculateNOM(String filepath) throws IOException {
        List<String> sourceCodeList = filereader.ReadFileIntoList(filepath);
        int methodCounter = 0;
        for (String line : sourceCodeList) {
            line = line.trim();
            // clear all leading and trailing white spaces
            if (((line.contains("public") || line.contains("private") || line.contains("protected"))
                    || line.contains("void") || line.contains("int") || line.contains("String")) && line.contains("(")
                    && line.contains(")") && line.contains("{"))
                methodCounter++;
        }
        return methodCounter;
    }

    @Override
    public int calculateNOC(String filepath) throws IOException {
        List<String> sourceCodeList = filereader.ReadFileIntoList(filepath);
        int classCounter = 0;
        for (String line : sourceCodeList) {
            line = line.trim();
            // remove leading and trailing white spaces
            if ((line.startsWith("class ") || line.contains(" class ")) && line.contains("{")) {
                classCounter++;
            }
        }
        return classCounter;
    }

}