package gnu.core

class Plotter(private val formula: String) {
  def getPlotString = s"plot ${formula}"
}
