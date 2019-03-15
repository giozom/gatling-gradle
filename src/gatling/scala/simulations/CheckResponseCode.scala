package simulations

import baseConfig.BaseSimulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class CheckResponseCode extends BaseSimulation {

  //define scenarios
  val scn = scenario("JSON Placeholder Typicode Posts")

    .exec(http("Get PostID 1")
      .get("posts/1")
    .check(status.is(200))) //check status code

    .exec(http("Get All Comments for PostID 1")
      .get("posts/1/comments")
    .check(status.in(200 to 210))) //check status range

    .exec(http("Get All Comments")
      .get("comments")
    .check(status.not(404), status.not(500)))

  //define load
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)

}

