package simulations

import baseConfig.BaseSimulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class CheckResponseBodyAndExtract extends BaseSimulation{

  //define scenarios
  val scn = scenario("JSON Placeholder Typicode Posts")

    //Verify response body using JSONPath
    //Verify Title for Post Id 1 is json-server
    .exec(http("Get PostID 1")
      .get("posts/1")
      .check(jsonPath("$.title").is("json-server")))

      //Get all posts and extract Post id 2 and save in variable `postId'
      .exec(http("Get All Posts")
      .get("posts")
      .check(jsonPath("$[1].id").saveAs("myPostId")))

    //Print all the values within a session with this function literal.
    .exec { session =>
      println(session)
      session }

    //Get specific post. In this case Post Id 2
    .exec(http("Get Specific Post")
      .get("posts/${myPostId}")
      .check(jsonPath("$.title").is("json-server-2"))
      .check(bodyString.saveAs("responseBody"))) //Display responseBody

    .exec { session =>
      println(session("responseBody").as[String])
      session
  }

  //define load
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)

}
