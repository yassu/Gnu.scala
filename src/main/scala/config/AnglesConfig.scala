package gnu.config

import gnu.config.Config

class AnglesConfig(val angle: AbstractAngle) extends Config {
  def executeString:String = s"set angles ${angle}"
}

sealed abstract class AbstractAngle

final class DegreesAngle extends AbstractAngle {
  override def toString:String = "degrees"
}

final class RadiansAngle extends AbstractAngle {
  override def toString:String = "radians"
}
