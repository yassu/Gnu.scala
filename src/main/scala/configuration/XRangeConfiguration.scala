package gnu.configuration

class XRangeConfiguration(val start: Option[Double], val end: Option[Double]) {

  def getOptionString:String = "[%s, %s]".format(
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
