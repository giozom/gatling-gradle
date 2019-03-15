package simulations

import baseConfig.BaseSimulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration.DurationInt

class AddPauseTime extends BaseSimulation {

  //define scenarios
  val scn = scenario("JSON Placeholder Typicode Posts")

    .exec(http("Get PostID 1")
      .get("posts/1"))
    .pause(5)

    .exec(http("Get All Comments for PostID 1")
      .get("posts/1/comments"))
    .pause(5)

    .exec(http("Get All Comments")
      .get("comments"))
    .pause(3000.milliseconds)

  //define load
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)

}
