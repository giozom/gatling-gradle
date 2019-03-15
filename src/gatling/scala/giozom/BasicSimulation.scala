package giozom

import io.gatling.http.Predef._
import io.gatling.core.Predef._

class BasicSimulation extends Simulation {
  val httpConf = http.baseURL("https://jsonplaceholder.typicode.com/")
  val scn = scenario("Basic Simulation")
    .exec(http("Get All Posts")
      .get("posts"))
    .pause(5)
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)
}
