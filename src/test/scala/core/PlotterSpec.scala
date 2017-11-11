package gnu.test.core
import gnu.core.Plotter

import org.specs2._

class PlotterSpec extends org.specs2.mutable.Specification {
  "#Init" >> {
    new Plotter("x * x")

    1 must_== 1
  }
  "#getPlotString" >> {
    new Plotter("x*x").getPlotString must_== "plot x*x"
  }
}

