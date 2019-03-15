package baseConfig

//Must always be imported
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BaseSimulation extends Simulation {
  //1. Common HTTP Configuration
  val httpConf = http
    .baseURL("https://jsonplaceholder.typicode.com/")
    //.header("Accept", "application/json")
}
