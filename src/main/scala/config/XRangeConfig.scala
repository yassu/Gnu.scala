package gnu.config

import gnu.core.ExecuteItem
import gnu.config.Config

class XRangeConfig(private val start: Option[Double], private val end: Option[Double],
  private val isReverse: Option[Boolean]=None
  ) extends Config {

  def executeString:String = "set xrange [%s:%s]".format(
    this.start match {
      case Some(f) => f.toString
      case None => ""
    },
    this.end match {
      case Some(f) => f.toString
      case None => ""
    }
  ) +
  (isReverse match {
    case Some(true) => " reverse"
    case Some(false) => " noreverse"
    case None => ""
  })
}
