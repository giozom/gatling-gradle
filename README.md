# gatling-gradle
A Gatling gradle demo project using JSON Placeholder Typicode sample API

https://github.com/giozom/json-server

# Prerequisites
You will need the following pre-installed (If not then install them and ensure Java and Scala are added to your PATH) 
* Java 8 JDK (once installed add to your PATH)
* Gradle 3.1 + 
* IntelliJ Community Edition
* Scala SDK (once installed add to your PATH)
* IntelliJ Scala Plugin

# Setup your local API server 
* Clone https://github.com/giozom/json-server**
* Run ```npm install```
* Run ```npm start```
* This bring up your local API server pointing to ```http://localhost:3000```

# Setup your Gatling environment
* Clone this project
* Import/open the project into IntelliJ
* Ensure you have Auto-import checked
* Once imported, the project will automatically build

# Using the Gatling test runner to execute tests
* Use the Gatling runner (```MyGatlingRunner```) to run your test separately. (one at a time)
* Open MyGatlingRunner file, and right click on the main method to run the test specified in ```..classOf[MyFirstTest]```

Simply replace the test name/class name.

*i.e. ```val simClass = classOf[***test_name_here***].getName```
* Example: ```    val simClass = classOf[MyFirstTest].getName```

Then ***right click*** on the main method (i.e. ```def main(args: Array[String]):``` and click ***Run 'MyGatlingRunner'***

# Reporting
You will find the test report in this location ```~\gatling-gradle\results\...\index.html ```


# Other references
* Gatling cheat sheet https://gatling.io/docs/current/cheat-sheet
* Fake REST API https://github.com/giozom/json-server
* Gatling https://gatling.io
