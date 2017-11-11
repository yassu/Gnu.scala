package gnu.core

import gnu.core.ExecuteItem

class ExecuteItemList(val execList: List[ExecuteItem]) {
  override def toString:String = execList.map(e => e.executeString).mkString("\n")
}
