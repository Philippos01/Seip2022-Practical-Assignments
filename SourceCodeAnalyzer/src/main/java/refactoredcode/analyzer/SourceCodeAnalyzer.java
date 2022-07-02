package refactoredcode.analyzer;

import java.io.IOException;
import refactoredcode.FileReader.File_Reader;

/**
 * Defines the methods that can be implemented by the
 * other analyzer classes in order to calculate some code metrics(LOC,NOM,NOC)
 *
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */

public abstract class SourceCodeAnalyzer {

    protected File_Reader filereader;

    public void setFileReader(File_Reader filereader) {
        this.filereader = filereader;
    }

    public File_Reader getFileReader() {
        return filereader;
    }

    public abstract int calculateLOC(String filepath) throws IOException;

    public abstract int calculateNOM(String filepath) throws IOException;

    public abstract int calculateNOC(String filepath) throws IOException;

}