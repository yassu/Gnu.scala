package gnu.core.plotter

import gnu.core.ExecuteItem

class Plotter(private val formulas: List[String],
    private val xMin:Option[Double]=None, private val xMax:Option[Double]=None
    ) extends ExecuteItem {

  def rangeString:String = if (xMin == None && xMax == None) "" else s"[%s:%s]".format(
    xMin match {
      case Some(x) => x.toString
      case None => ""
    },
    xMax match {
      case Some(x) => x.toString
      case None => ""
    }
  )
  def executeString:String = {
    var rangeString = this.rangeString

    if (rangeString.isEmpty) {
      s"plot ${formulas.mkString(", ")}"
    } else {
      s"plot ${rangeString} ${formulas.mkString(", ")}"
    }
  }
}
