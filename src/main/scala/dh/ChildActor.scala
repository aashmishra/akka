package dh

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
//import dh.ChildActor.Parent.{CreateChild, TellChild}

object ChildActor {

//  object Parent
//{
//  case class CreateChild(name : String)
//  case class TellChild(message: String)
//  }
//
//  class Parent extends Actor{
//    import Parent._
//    override def receive: Receive = {
//      case CreateChild(name)=> println( s"${self.path} create child")
//        // create new actor right here
//      val childRef = context.actorOf(Props[Child],name)
//        context.become(WithChild(childRef))
//    }
//      def WithChild(childRef: ActorRef):Receive={
//        case TellChild(message)=> if (childRef!=null) childRef forward( message)
//      }
//  }
//  class Child extends  Actor{
//    override def receive: Receive ={
//      case message=>println( s"${self.path} I got message $message")
//    }
//  }
//  def main(args: Array[String]): Unit = {
//    val system = ActorSystem("ParentChildDema")
//    val parent = system.actorOf(Props[Parent], "parent")
//    parent ! CreateChild("Child")
//    parent ! TellChild("Hi ! Kid")
//    val childSelection  = system.actorSelection("/user/parent/Child")
//    childSelection ! "I Found You"
//  }




}
