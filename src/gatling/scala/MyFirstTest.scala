//Must always be imported
import baseConfig.BaseSimulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class MyFirstTest extends BaseSimulation {

  //2. Scenario definition
  val scn = scenario("JSONPlaceholder Typicode")
    .exec(http("Get All Posts")
      .get("posts"))
    .pause(5)

  //3. Load Profile
  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)
}
