package demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import refactoredcode.analyzer.*;
import refactoredcode.MetricsExporter.*;

 /**
  * This is the main class that loads the data and calls all the other classes
  *
  * @author  Fpriovolos
  * @version 1.0
  * @since   2022-05-21
  */

public class DemoClient {

	public static void main(String[] args) throws IOException {
		String filepath = "src/main/resources/TestClass.java";
		String sourceCodeAnalyzerType = "regex";
		String sourceFileLocation = "local";
		String outputFilePath = "output_metrics";
		String outputFileType = "csv";
		
		if(args.length == 5) {
			filepath = args[0];
			sourceCodeAnalyzerType = args[1];
			sourceFileLocation = args[2];
			outputFilePath = args[3];
			outputFileType = args[4];
		} else if (args.length != 0) {
			System.out.println("Incorrect number of arguments.");
			System.exit(1);
		}

		SourceCodeAnalyzer analyzer=null;

		if (args[1].equals("regex")) {
			analyzer = new RegexAnalyzer();
		}
		else if (args[1].equals("string")){
			 analyzer = new StringCompAnalyzer();
		}
		else if (args[1].equals(null)){
			 analyzer = new NullAnalyzer();
		}
		int loc = analyzer.calculateLOC(filepath);
		int nom = analyzer.calculateNOM(filepath);
		int noc = analyzer.calculateNOC(filepath);
		
		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",loc);
		metrics.put("nom",nom);
		metrics.put("noc",noc);

		MetricsExporter exporter=null;

		if (args[4].equals("csv")) {
			 exporter = new CSV();
		}
		else if (args[4].equals("json")){
			 exporter = new JSON();
		}
		else if (args[4].equals(null)){
			 exporter = new Null();
		}

		exporter.ExportToFile(outputFilePath,metrics);
	}

}
