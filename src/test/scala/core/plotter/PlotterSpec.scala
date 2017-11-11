package gnu.test.core.plotter
import gnu.core.plotter.Plotter

import org.specs2._

class PlotterSpec extends org.specs2.mutable.Specification {
  "#Init" >> {
    new Plotter("x * x")

    1 must_== 1
  }
  "#executeString" >> {
    new Plotter("x*x").executeString must_== "plot x*x"
  }
}

