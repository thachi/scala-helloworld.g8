package $package$

import org.scalatest._

class $classname$Spec extends FlatSpec with Matchers {

  "$classname$" should "create a simple greeting" in {
    val greeting = $classname$.createGreeting(Array())
    greeting should be("Hello!")
  }

  it should "create a greeting with name" in {
    val greeting = $classname$.createGreeting(Array("Takashi"))
    greeting should be("Hello Takashi!")
  }
}
