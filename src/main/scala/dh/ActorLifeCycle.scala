package dh

import akka.actor.{Actor, ActorLogging, ActorSystem, Kill, PoisonPill, Props}

object ActorLifeCycle {
//  object startChild
//class LifeCycleActor extends Actor with ActorLogging
//  {
//    import  startChild._
//    override def preStart(): Unit = log.info("I am Starting")
//    override def postStop(): Unit = log.info("I am Stopping")
//    override def receive: Receive = {
//      case startChild=>
//        val child = context.actorOf(Props[LifeCycleActor],"child")
//
//    }
//  }
//  def main(args: Array[String]): Unit = {
//  val system = ActorSystem("LifeCycleDemo")
//  val Parent = system.actorOf(Props[LifeCycleActor],"Parent")
//    Parent ! startChild
//    Parent ! PoisonPill
//    val supervisor = system.actorOf(Props[Parent],"supervisor")
//    supervisor ! FailChild
//    supervisor ! CheckChild
//  }
//
//  /**
//    *
//    * restart
//    */
//
//   object Fail
//  object FailChild
//  object CheckChild
//  object Check
//
//  class Parent extends Actor
//  {
//    private  val  child =  context.actorOf(Props[Child],"supervisedChild")
//
//    override def receive: Receive = {
//      case FailChild =>  child! Fail
//      case CheckChild =>  child ! Check
//
//
//    }
//  }
//  class Child extends Actor with ActorLogging
//  {
//    override def preStart(): Unit = log.info("supervised Child Started")
//    override def postStop(): Unit = log.info("supervised Child Stopped")
//
//    override def preRestart(reason: Throwable, message: Option[Any]): Unit =
//      log.info(s"supervised Actor Restarting because of following reason :$reason")
//
//    override def postRestart(reason: Throwable): Unit =
//      log.info(s"supervised Actor Restarted")
//    override def receive: Receive = {
//      case Fail => log.warning("child will Fail Now")
//        throw new RuntimeException("I Failed")
//      case Check=>
//        log.info("alive and Kicking")
//
//    }
//  }


}
