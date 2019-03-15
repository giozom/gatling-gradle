# gatling-gradle
A Gatling gradle demo project using JSON Placeholder Typicode fake API

https://jsonplaceholder.typicode.com/

# Prerequisites
You will need the following pre-installed (If not then install them and ensure Java and Scala are added to your PATH) 
* Java 8 JDK (once installed add to your PATH)
* Gradle 3.1 + 
* IntelliJ Community Edition
* Scala SDK (once installed add to your PATH)
* IntelliJ Scala Plugin

# Using the Gatling runner
Use the Gatling runner to run your test separately. (one at a time) 

Simply replace the test name/class name.

i.e. ```val simClass = classOf[***test_name_here***].getName```

Then ***right click*** on the main method (i.e. ```def main(args: Array[String]):``` and click ***Run 'MyGatlingRunner'***

# Reporting
You will find the test report in this location ```~/build/reports/.../index.html ```

# Running test using the gradle task
```~/gradlew gatlingRun```
or
```~/gradlew gatlingRun-com.concur.[test-name-here]```

# Other references
Gatling cheat sheet https://gatling.io/docs/current/cheat-sheet
Fake REST API https://jsonplaceholder.typicode.com/
Gatling https://jsonplaceholder.typicode.com/
