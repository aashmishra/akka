package dh

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
object CounterStateless {

//  object Counter
//  {
//    case object IncreaseCounter
//    case object DecreaseCounter
//    case object Print
//
//  }
//
//  class Counter extends Actor {
//    import Counter._
// //   var counter=0
//    override  def receive = countReceive(0)
//    def countReceive(currentCount:Int):Receive= {
//      case Print =>println(s"Hi I got the messge : $currentCount :  $self")
//      case IncreaseCounter=>{
//        context.become(countReceive(currentCount+1))
//        println(s"[count Received (:$currentCount)] incrementing")
//      }
//      case DecreaseCounter=>{
//        context.become(countReceive(currentCount-1))
//        println(s"[count Received (:$currentCount)] decrementing")
//      }
//      case _ => println("Error: message not recognized")
//    }
//  }
//    def main(args: Array[String]): Unit = {
//      import Counter._
//
//      val system = ActorSystem("ActorDemo")
//      val simpleActor = system.actorOf(Props[Counter], name = "simpleActor")
//      val simpleActor1 = system.actorOf(Props[Counter], name = "simpleActor1")
//      (1 to 5).foreach(_ => simpleActor ! IncreaseCounter)
//      (1 to 3).foreach(_ => simpleActor ! DecreaseCounter)
//      simpleActor ! Print
//      (1 to 5).foreach(_ => simpleActor1 ! IncreaseCounter)
//      (1 to 3).foreach(_ => simpleActor1 ! DecreaseCounter)
//      simpleActor1 ! Print
//    }


}
