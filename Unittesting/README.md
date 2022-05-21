# Test Maven Project 
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Build Status](https://app.travis-ci.com/Philippos01/Lab_Assignments.svg?token=2QmbXKzpQWFaJg2jpR36&branch=development)](https://app.travis-ci.com/Philippos01/Lab_Assignments)
[![codecov](https://codecov.io/gh/Philippos01/Lab_Assignments/branch/development/graph/badge.svg?token=R5DGGPMKUA)](https://codecov.io/gh/Philippos01/Lab_Assignments)

## About Unit Testing

We use Unit Testing, which is a software testing method in order to check individual units of source code.
Specifically we check the functionality of all the java files that are located in the [Unittesting](https://github.com/Philippos01/Lab_Assignments/tree/development/Unittesting) directory.

## Test Project

To simply run the unit tests of the project, execute the following Maven command:
```
mvn test
```
## Generate Test-coverage report
To generate the code coverage jacoco report, execute the following Maven command:
```
mvn test jacoco:report
```
## Code Coverage Services
### Codecov
This repository is linked to the [Codecov](https://codecov.io/) service.
Codecov calculates and generates the test coverage of this repository uploading the results on their website.
<br>
<br>
#### Chart
The inner-most circle is the entire project, moving away from the center are folders then, finally, a single file. The size and color of each slice is representing the number of statements and the coverage, respectivel

<img src="Lab_Assignments/images/graph.svg">


