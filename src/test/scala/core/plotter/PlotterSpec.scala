package gnu.test.core.plotter
import gnu.core.plotter.Plotter

import org.specs2._

class PlotterSpec extends org.specs2.mutable.Specification {
  "#Init" >> {
    new Plotter("x * x")

    1 must_== 1
  }
  "#optionString" >> {
    "Neither is set" >> {
      new Plotter("x*x").rangeString must_== ""
    }
    "Just Left is set" >> {
      new Plotter("x*x", xMin=Some(-1.0)).rangeString must_== "[-1.0:]"
    }
    "Just Right is set" >> {
      new Plotter("x*x", xMax=Some(1.0)).rangeString must_== "[:1.0]"
    }
    "Both are set" >> {
      new Plotter("x*x", xMin=Some(-1.0), xMax=Some(1.0)).rangeString must_== "[-1.0:1.0]"
    }
  }
  "#executeString" >> {
    "Neither is set" >> {
      new Plotter("x*x").executeString must_== "plot x*x"
    }
    "Just Left is set" >> {
      new Plotter("x*x", xMin=Some(-1.0)).executeString must_== "plot [-1.0:] x*x"
    }
    "Just Right is set" >> {
      new Plotter("x*x", xMax=Some(1.0)).executeString must_== "plot [:1.0] x*x"
    }
    "Both are set" >> {
      new Plotter("x*x", xMin=Some(-1.0), xMax=Some(1.0)).executeString must_==
        "plot [-1.0:1.0] x*x"
    }
  }
}

