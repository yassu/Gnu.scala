package gnu.test.core
import gnu.core.ExecuteItemList
import gnu.core.ExecuteItem
import gnu.core.Plotter
import gnu.config.XRangeConfig

import org.specs2._

class ExecuteItemListSpec extends org.specs2.mutable.Specification {
  "#Init" >> {
    "#Empty" >> {
      val l = new ExecuteItemList(List[ExecuteItem]())

      l.toString must_== ""
    }
  }
  "#AllConfigure" >> {
    val l = new ExecuteItemList(List(
      new Plotter("x * x"),
      new XRangeConfig(Some(-1), Some(1))
    ))

    l.toString must_==
      "plot x * x\n" +
      "set xrange [-1.0:1.0]"
  }
}

