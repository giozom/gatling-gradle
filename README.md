# gatling-gradle
A Gatling gradle demo project using JSON Placeholder Typicode sample API

https://github.com/typicode/json-server

# Prerequisites
You will need the following pre-installed (If not then install them and ensure Java and Scala are added to your PATH) 
* Java 8 JDK (once installed add to your PATH)
* Gradle 3.1 + 
* IntelliJ Community Edition
* Scala SDK (once installed add to your PATH)
* IntelliJ Scala Plugin

# Setup your local server
* Clone https://github.com/typicode/json-server
* Run ```npm install```
* Run ```npm start```
* This bring up your local server pointing to ```http://localhost:3000```

# Setup your Gatling environment
* Clone this project
* Import/open the project into IntelliJ
* Ensure you have Auto-import checked
* Once imported, the project will automatically build

# Using the Gatling runner
* Use the Gatling runner (```MyGatlingRunner```) to run your test separately. (one at a time)
* Open MyGatlingRunner file, and right click on the main method to run the test specified in ```..classOf[MyFirstTest]```

Simply replace the test name/class name.

i.e. ```val simClass = classOf[***test_name_here***].getName```

Then ***right click*** on the main method (i.e. ```def main(args: Array[String]):``` and click ***Run 'MyGatlingRunner'***

# Reporting
You will find the test report in this location ```~/build/reports/.../index.html ```

# Running test using the gradle task
```~/gradlew gatlingRun``` - Executes all Gatling simulations configured by extension

or

```$ gradle gatlingRun-com.project.simu.MySimulation - Executes single Gatling simulation

# Other references
* Gatling cheat sheet https://gatling.io/docs/current/cheat-sheet
* Fake REST API https://jsonplaceholder.typicode.com/
* Gatling https://jsonplaceholder.typicode.com/
