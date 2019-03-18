package simulations

import baseConfig.BaseSimulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class CheckResponseBodyAndExtract extends BaseSimulation{

  //define scenarios
  val scn = scenario("JSON Placeholder Typicode Posts")

    //Verify response body using JSONPath
    .exec(http("Get PostID 1")
      .get("posts/1")
      .check(jsonPath("$.title").is("json-server")))

  //define load
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)

}
