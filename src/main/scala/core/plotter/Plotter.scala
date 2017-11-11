package gnu.core.plotter

import gnu.core.ExecuteItem

class Plotter(private val formula: String) extends ExecuteItem {
  def executeString:String = s"plot ${formula}"
}
