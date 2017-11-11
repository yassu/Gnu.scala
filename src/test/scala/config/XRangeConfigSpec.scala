package gnu.test.config

import gnu.config.XRangeConfig
import org.specs2._

class XRangeConfigSpec extends org.specs2.mutable.Specification {
  "#Init" >> {
    new XRangeConfig(Some(-1), Some(1))

    1 must_== 1
  }
  "#executeString" >> {
    "case: Both are set" >> {
      new XRangeConfig(Some(-1), Some(1)).executeString must_== "set xrange [-1.0:1.0]"
    }
    "case: Just Left is set" >> {
      new XRangeConfig(Some(-1), None).executeString must_== "set xrange [-1.0:]"
    }
    "case Just Right is set" >> {
      new XRangeConfig(None, Some(1)).executeString must_== "set xrange [:1.0]"
    }
    "Neither is set" >> {
      new XRangeConfig(None, None).executeString must_== "set xrange [:]"
    }
  }
}

