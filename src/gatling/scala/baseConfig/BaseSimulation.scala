package baseConfig

//Must always be imported
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BaseSimulation extends Simulation {
  //1. Common HTTP Configuration
  val httpConf = http
    .baseURL("https://jsonplaceholder.typicode.com/")
    .header("Accept", "application/json")
   // .proxy(Proxy("host",8080)
     // .httpsPort(8080)
    //.credentials("username", "password")
}
