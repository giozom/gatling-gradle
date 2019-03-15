package giozom

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object MyGatlingRunner {

  def main(args: Array[String]): Unit = {

    //calling BasicSimulation here to run only this test. Useful for debugging
    //Can be used whenever you want to run a specific test
    val simClass = classOf[BasicSimulation].getName

    val props = new GatlingPropertiesBuilder
    props.simulationClass(simClass)

    Gatling.fromMap(props.build)
  }

}

