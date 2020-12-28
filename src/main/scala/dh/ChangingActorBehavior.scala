package dh

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
//import dh.ChangingActorBehavior.Mom.{Food, MomStart}

object ChangingActorBehavior {

//  object FussyKid{
//
//    case object KidAccept
//    case object KidReject
//    val HAPPY="happy"
//    val SAD="sad"
//  }
//    class FussyKid extends Actor
//    {
//      import FussyKid._
//      import Mom._
//      var state=HAPPY
//      override def receive: Receive = {
//        case Food(VEGETABLE)=>state=SAD
//        case Food(CHOCOLATE)=>state=HAPPY
//        case Ask(message)=>if (state==HAPPY) sender() ! KidAccept
//                                else sender() ! KidReject
//
//      }
//    }
//  class statelessFussyKid extends Actor{
//    import FussyKid._
//    import Mom._
//    override def receive: Receive = happyReceiver
//    def happyReceiver:Receive={
//      case Food(VEGETABLE)=>context.become(sadReceiver)
//      case Food(CHOCOLATE)=>
//      case Ask(_)=> sender() ! KidAccept
//    }
//    def sadReceiver:Receive ={
//      case Food(CHOCOLATE)=>context.become(happyReceiver)
//      case Food(VEGETABLE)=>
//      case Ask(_)=> sender() ! KidReject
//    }
//  }
//
//  object Mom{
//    case class MomStart(kidRef:ActorRef)
//    case class Food (food:String)
//    case class Ask(message:String)
//    val VEGETABLE="veggies"
//    val CHOCOLATE="chocolate"
//  }
//  class Mom extends Actor{
//    import Mom._
//    import  FussyKid._
//
//    override def receive: Receive = {
//
//      case MomStart(kidRef)=> kidRef ! Food(VEGETABLE)
//        kidRef ! Ask("do you want to Play?")
//      case KidAccept=> println("Ya! My Kid is happy")
//      case KidReject=>println("My Kid is sad, but as he's healthy")
//    }
//  }
//  def main(args: Array[String]): Unit = {
//    val system = ActorSystem("ChangingActorBehavior")
//      val fussyKid =system.actorOf(Props[FussyKid])
//    val statelessFuzzyKid = system.actorOf(Props[statelessFussyKid])
//    val mom=system.actorOf(Props[Mom])
//    mom ! MomStart(statelessFuzzyKid)
//  }
}
