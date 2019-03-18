//Must always be imported
import baseConfig.BaseSimulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class MyFirstTest extends BaseSimulation {
  //load profile
  val t_iterations = Integer.getInteger("iterations", 100).toInt
  val t_concurrency = Integer.getInteger("concurrency", 10).toInt
  val t_rampUp = Integer.getInteger("ramp-up", 1).toInt
  val t_holdFor = Integer.getInteger("hold-for", 60).toInt
  val t_throughput = Integer.getInteger("throughput", 100).toInt

  //2. Scenario definition
  // 'forever' means each thread will execute scenario until
  // duration limit is reached
  val loopScenario  = scenario("JSONPlaceholder Typicode").forever(){
    exec(http("Get All Posts")
      .get("posts"))
      //.pause(5)
  }

  // if you want to set an iteration limit (instead of using duration limit),
  // you can use the following scenario
  /*val iterationScenario = scenario("Iteration Scenario").repeat(t_iterations) {
    exec(http("Get All Posts").get("/"))
  }*/

  val execution = loopScenario
    .inject(rampUsers(t_concurrency) over t_rampUp)
    .protocols(httpConf)


  //3. Load Profile
  setUp(execution).
    throttle(jumpToRps(t_throughput), holdFor(t_holdFor)).
    maxDuration(t_rampUp + t_holdFor)
}
