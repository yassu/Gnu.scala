package gnu.core

import gnu.core.ExecuteItem
import java.io._

class ExecuteItemList(val execList: List[ExecuteItem]) {
  private def printToFile(f: File)(op: PrintWriter => Unit) {
    val p = new PrintWriter(f)
    try {
      op(p)
    } finally {
      p.close()
    }
  }

  def writeInto(f: File) {
    printToFile(f) {p => p.println(this.toString)}
  }

  override def toString:String = execList.map(e => e.executeString).mkString("\n")
}
