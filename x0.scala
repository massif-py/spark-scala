import java.awt.Desktop
import java.net.{URI, URL}
import scala.collection.mutable.ListBuffer

object etherApp {
  def main(args : Array[String]) : Unit = {
    var listBuffer = new ListBuffer[Int]()
    for (i <- 1 to 10) {
      listBuffer += i
      Desktop.getDesktop.browse(new URI("https://" + args(0) + i.toString()))
    }
  }
}