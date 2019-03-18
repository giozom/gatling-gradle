package baseConfig

//Must always be imported
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BaseSimulation extends Simulation {
   //1. Common HTTP Configuration
  val httpConf = http
    .baseURL("http://localhost:3000/")
    .header("Accept", "application/json")
}
