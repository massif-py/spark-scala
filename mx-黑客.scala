/*
 * scala mx-黑客 [-y] [-Y] = shutdown -s -t 5
 * scala mx-黑客 [-n] [-N] = curl parrot.live
*/

import java.util.Calendar
import scala.sys.process._
import scala.language.postfixOps

object URI{
    def main(args : Array[String]) : Unit ={
        if(args(0) == "-y" || args(0) == "-Y"){
            val dT = Calendar.getInstance().getTime()
            println("TIME OF LOGOUT: " + dT)
            Process("shutdown -s -t 5")!
        }
        else if(args(0) == "-n" || args(0) == "-N"){
            println(":parrot-live:")
            Process("curl parrot.live")!
        }

    }
}
