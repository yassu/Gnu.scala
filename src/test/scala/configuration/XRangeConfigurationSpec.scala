package gnu.configuration

import org.specs2._

class XRangeConfigurationSpec extends org.specs2.mutable.Specification {
  "#Init" >> {
    new XRangeConfiguration(Some(-1), Some(1))

    1 must_== 1
  }
  "#getOptionString" >> {
    "case: Both are set" >> {
      new XRangeConfiguration(Some(-1), Some(1)).getOptionString must_== "set xrange [-1.0:1.0]"
    }
    "case: Just Left is set" >> {
      new XRangeConfiguration(Some(-1), None).getOptionString must_== "set xrange [-1.0:]"
    }
    "case Just Right is set" >> {
      new XRangeConfiguration(None, Some(1)).getOptionString must_== "set xrange [:1.0]"
    }
    "Neither is set" >> {
      new XRangeConfiguration(None, None).getOptionString must_== "set xrange [:]"
    }
  }
}

