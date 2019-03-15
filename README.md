# gatling-gradle
A Gatling gradle demo project using JSON Placeholder Typicode fake API

# Using the Gatling runner
Use the Gatling runner to run your test separately. (one at a time) 

Simply replace the test name/class name.

i.e. ```val simClass = classOf[***test_name_here***].getName```

Then right click on the main method and click ***Run 'MyGatlingRunner'***

# Report location can be found here
~/build/reports/.../index.html 

# Running test using the gradle task
~/gradlew gatlingRun

# Other references
Gatling cheat sheet https://gatling.io/docs/current/cheat-sheet
