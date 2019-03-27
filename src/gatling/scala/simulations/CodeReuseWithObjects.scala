package simulations

import baseConfig.BaseSimulation
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

class CodeReuseWithObjects extends BaseSimulation {

  //example of code resuse with methods
  def getAllComments()  = {
    exec(http("Get All Comments")
      .get("comments")
      .check(status.is(200))) //check status code
  }

  def getSpecificPostComment() = {
    exec(http("Get All Comments for PostID 1")
      .get("posts/1/comments")
      .check(status.in(200 to 210)))
  }

  //Scenario calling methods
  val scn = scenario("Post Comments")
      .exec(getAllComments())
      .pause(5)
      .exec(getSpecificPostComment())
      .pause(5)
      .exec(getAllComments())

  //define load
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)

}
