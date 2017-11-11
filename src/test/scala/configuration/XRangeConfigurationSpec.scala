package gnu.configuration

import org.specs2._

class XRangeConfigurationSpec extends org.specs2.mutable.Specification {
  "#Init" >> {
    new XRangeConfiguration(Some(-1), Some(1))

    1 must_== 1
  }
}

