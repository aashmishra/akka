package dh

import akka.actor.{Actor, ActorLogging, ActorSystem, Cancellable, Props, Timers}

import scala.concurrent.duration._
object TimeSchedulers {
// class SimpleActor extends Actor  with ActorLogging
//  {
//    override def receive: Receive = {
//      case message=> log.info(message.toString)
//
//    }
//  }
//
//  val system =ActorSystem("SchedulersTimeDemo")
//class SelfClosingActor extends  Actor with ActorLogging{
//
//
//  import system.dispatcher
//
//  var schedule = createTimeoutWindow()
//  def createTimeoutWindow():Cancellable={
//    context.system.scheduler.scheduleOnce(1 second){
//      self ! "timeout"
//    }(system.dispatcher)
//  }
//  override def receive: Receive = {
//    case "timeout" =>log.info("Stopping Myself")
//      context.stop(self)
//    case message => log.info(s"Received $message ,staying Alive")
//      schedule.cancel()
//      schedule = createTimeoutWindow()
//
//  }
//}
//
//case object TimerKey
//  case object Start
//  case object Reminder
//  case object Stop
//  class TimerBasedHeartbeatActor extends Actor with ActorLogging with Timers{
//    timers.startSingleTimer(TimerKey,Start,500 milliseconds)
//
//    override def receive: Receive = {
//      case Start=> log.info("BootStrapping")
//        timers.startPeriodicTimer(TimerKey,Reminder,1 seconds)
//      case Reminder=> log.info("I am Alive")
//      case Stop=> log.warning("Stopping")
//        timers.cancel(TimerKey)
//        context.stop(self)
//    }
//  }
//  def main(args: Array[String]): Unit = {
//
//   // val simpleActor = system.actorOf(Props[SimpleActor])
//
//    system.log.info("Scheduler reminder for SimpleActor")
//
//    import system.dispatcher
////    system.scheduler.scheduleOnce(1 second){
////      simpleActor  ! "reminder"
////    }
////
////    val routine : Cancellable= system.scheduler.schedule(1 second, 2 second){
////      simpleActor ! "heartbeat"
////    }
////    system.scheduler.scheduleOnce( 5 second  ){
////      routine.cancel()
////    }
//
////  val selfClosingActor = system.actorOf(Props[SelfClosingActor],"selfclosingActor")
////    system.scheduler.scheduleOnce(250 millisecond){
////      selfClosingActor ! "ping"
////    }
////
////    system.scheduler.scheduleOnce(2 seconds)
////    {
////      system.log.info("sending ping to the selfclosing actor")
////      selfClosingActor ! "Pong"
////    }
//    val timerBasedHeartbeatActor = system.actorOf(Props[TimerBasedHeartbeatActor],"timeActor")
//    system.scheduler.scheduleOnce(5 seconds){
//      timerBasedHeartbeatActor ! Stop
//    }
//  }

}
