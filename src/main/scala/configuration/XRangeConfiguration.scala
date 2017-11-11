package gnu.configuration

class XRangeConfiguration(private val start: Option[Double], private val end: Option[Double]) {

  def getOptionString:String = "set xrange [%s:%s]".format(
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
