package gnu.configuration

import gnu.core.ExecuteItem

class XRangeConfiguration(private val start: Option[Double], private val end: Option[Double]
  ) extends Configuration {

  def executeString:String = "set xrange [%s:%s]".format(
    this.start match {
      case Some(f) => f.toString
      case None => ""
    },
    this.end match {
      case Some(f) => f.toString
      case None => ""
    }
  )
}
