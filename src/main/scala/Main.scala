import gnu.configuration.XRangeConfiguration
import gnu.core.ExecuteItem
import gnu.core.ExecuteItemList
import gnu.core.Plotter
import java.io.File

object Main extends App {
  val l = new ExecuteItemList(List(
    new Plotter("x * x"),
    new XRangeConfiguration(Some(-1), Some(1))
  ))

  l.writeInto("test.gnu")
}
