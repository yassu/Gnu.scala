package gnu.core

import gnu.core.ExecuteItem

class Plotter(private val formula: String) extends ExecuteItem {
  def executeString:String = s"plot ${formula}"
}
