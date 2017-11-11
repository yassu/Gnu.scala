import gnu.config.XRangeConfig
import gnu.core.ExecuteItem
import gnu.core.ExecuteItemList
import gnu.core.plotter.Plotter
import java.io.File

object Main extends App {
  val l = new ExecuteItemList(List(
    new Plotter("x * x"),
    new XRangeConfig(Some(-1), Some(1))
  ))

  l.writeInto("test.gnu")
}
