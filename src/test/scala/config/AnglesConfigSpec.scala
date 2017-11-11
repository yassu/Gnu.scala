package gnu.test.config

import gnu.config.AnglesConfig
import gnu.config.DegreesAngle
import org.specs2._

class AnglesConfigSpec extends org.specs2.mutable.Specification {
  "#Init" >> {
    new AnglesConfig(new DegreesAngle)

    1 must_== 1
  }
  "#executeString" >> {
    new AnglesConfig(new DegreesAngle).executeString must_==
      "set angles degrees"
  }
}

class DegreesAngleSpec extends org.specs2.mutable.Specification {
  "#Init" >> {
    new DegreesAngle()

    1 must_== 1
  }
  "#toString" >> {
    val angle = new DegreesAngle()
    angle.toString must_== "degrees"
  }
}
