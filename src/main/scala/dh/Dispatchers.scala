package dh

import akka.actor.{Actor, ActorContext, ActorLogging, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

import scala.util.Random

object Dispatchers {
class Counter extends  Actor with  ActorLogging{
  var count=0

  override def receive: Receive = {
    case message =>
      count+=1
      log.info(s"[$count] $message")
  }

}
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("DispatcherDemo") //, ConfigFactory.load().getConfig("dispatcherDemo"))
    val actors = for (i <- 1 to 10) yield system.actorOf(Props[Counter].withDispatcher("my-dispatcher"), s"count_$i")
    val r = new Random()
    for (i <- 1 to 1000) {
      actors(r.nextInt(5)) ! i
    }
    //Method 2  -from Config
    val rtjvmActor = system.actorOf(Props[Counter],"rtjvm")


  }
}
