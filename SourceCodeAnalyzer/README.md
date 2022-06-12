# Refactored Source Code

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Build Status](https://app.travis-ci.com/Philippos01/Lab_Assignments.svg?token=2QmbXKzpQWFaJg2jpR36&branch=development)](https://app.travis-ci.com/Philippos01/Lab_Assignments)
[![codecov](https://codecov.io/gh/Philippos01/Lab_Assignments/branch/development/graph/badge.svg?token=R5DGGPMKUA)](https://codecov.io/gh/Philippos01/Lab_Assignments)

## UML Class Diagram

--- 

This is a UML Class Diagram about the SourceCodeAnalyzer module.The Class Diagram visualizes 4 different packages:
1. ```demo```
2. ```analyzer```
3. ```FileReader```
4. ```MetricsExporter``` 

Each package has different classes that implement different tasks through the execution of the program achieving Low Coupling and High Cohesion.
<br>
<br>
<br>

<img src="images/Class-Diagram.png"/>

---

## New Implementation and Patterns used

The basic idea is that we refactored the old source code in order to achieve the same functionality and also follow the SOLID Design Principles.
So, the old code consisted of 3 important class(```MetricsExporter.java, SourceCodeAnalyzer.java, SourceFileReader.java```) in order to achieve functionality.
These classes had more than 1 purposes and tasks, so we tried to isolate each task and implement it under different classes. <br><br>
Thus, this is the new code architecture:

* **Package &#8594; analyzer**
  * NullAnalyzer.java &#8594; Handles the null type of SourceCodeAnalyzer throwing IllegalArgumentException.
  * RegexAnalyzer.java &#8594; Calculates source code metrics through Regex(Regular Expressions)
  * SourceCodeAnalyzer.java &#8594; Defines the methods that can be implemented by the other analyzer classes in order to calculate some code metrics(LOC,NOM,NOC)
  * StringCompAnalyzer.java &#8594; Calculates source code metrics through String Comparison
<br><br>
* **Package &#8594; FileReader**
  * File_Reader.java &#8594; Defines the methods that can be implemented by the other Reader classes in order to  read a file and return its content as a single String or a list of Strings.
  * LocalFileReader.java &#8594; Reads a local file and returns its content as a single String or a list of Strings.
  * NullFileReader.java &#8594; This class handles the null type of file throwing IllegalArgumentException.
  * WebFileReader.java &#8594; Reads a web file and returns its content as a single String or a list of Strings.
<br><br>
* **Package &#8594; MetricsExporter**
  * MetricsExporter.java &#8594; Defines the methods that can be implemented by the other MetricsExporter classes in order to format and export the output into the right file.
  * CSV.java &#8594; Formats and exports metrics(LOC,NOM,NOC) into a CSV file
  * JSON.java &#8594; Formats and exports metrics(LOC,NOM,NOC) into a JSON file
  * Null.java &#8594; This class handles the null type throwing IllegalArgumentException.

## Build the module and the coverage report
```
mvn clean package jacoco:report
```

## Execute the module

```
java –jar “jar-with-dependencies” arg0 arg1 arg2 arg3 arg4

  arg0 = “JavaSourceCodeInputFile” (e.g., src/test/resources/TestClass.java)
  arg1 = “sourceCodeAnalyzerType” [regex|strcomp]
  arg2 = “SourceCodeLocationType” [local|web]
  arg3 = “OutputFilePath” (e.g., ../output_metrics_file)
  arg4 = “OutputFileType” [csv|json]
```
Example:
```
java –jar ./target/SourceCodeAnalyzer-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./src/test/resources/TestClass.java regex local metrics_results csv
```