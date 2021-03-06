package gnu.config

import gnu.core.ExecuteItem
import gnu.config.Config

class XRangeConfig(private val start: Option[Double], private val end: Option[Double],
    private val isReverse: Option[Boolean]=None,
    private val isWriteBack: Option[Boolean]=None,
    private val restore: Option[Unit]=None
  ) extends Config {

  if (
    !restore.isEmpty && (
      ! start.isEmpty ||
      ! end.isEmpty ||
      ! isReverse.isEmpty ||
      ! isWriteBack.isEmpty
  )) {
    throw new IllegalArgumentException("XRangeConfig has illegal error.")
  }

  def executeString:String = if (restore.isEmpty) {
        "set xrange [%s:%s]".format(
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
    }) +
    (isWriteBack match {
      case Some(true) => " writeback"
      case Some(false) => " nowriteback"
      case None => ""
    })
  } else {
    "set xrange restore"
  }
}
