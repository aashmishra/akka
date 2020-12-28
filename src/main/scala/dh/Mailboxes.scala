package dh

//import akka.actor.{Actor, ActorLogging, ActorSystem, PoisonPill, Props}
//import akka.dispatch.{ControlMessage, PriorityGenerator, UnboundedPriorityMailbox}
//import com.typesafe.config.{Config, ConfigFactory}


object Mailboxes {
}

//val system = ActorSystem("MailboxsDemo",ConfigFactory.load().getConfig("mailboxsDemo"))
//  import system.dispatcher
//  class SimpleActor extends Actor with ActorLogging
//  {
//    override def receive: Receive = {
//      case message=> log.info(message.toString)
//    }
//  }
//
//  /**
//    * Ineresting Case  #1 - custom priority Mailbox
//    * P0-> most important
//    * P1
//    * P2
//    * P3
//    */
//
//  //Mailbox definition
//  class SupportTicketPriorityMailbox(setting:  ActorSystem.Settings, config: Config)
//  extends UnboundedPriorityMailbox(
//    PriorityGenerator{
//      case message: String if message.startsWith("P[0]")=> 0
//      case message: String if message.startsWith("P[1]")=> 1
//      case message: String if message.startsWith("P[2]")=> 2
//      case message: String if message.startsWith("P[3]")=> 3
//      case _ => 4
//    }
//  )
//  //step 1 - mark important messages as control messages
//  case object ManagementTicket extends ControlMessage
//  def  main(args: Array[String]): Unit = {
////    val supportTicketLogger = system.actorOf(Props[SimpleActor].withDispatcher("support-ticket-dispatcher"))
////    supportTicketLogger ! PoisonPill
////    supportTicketLogger ! "P[3] This thing would be nice to have "
////    supportTicketLogger ! "P[0] This needs to be solved Now!! "
////    supportTicketLogger ! "P[1] Do this when you have time "
////    supportTicketLogger ! "P[4] do it later "
//
//    val controlAwareActor = system.actorOf(Props[SimpleActor].withMailbox("control-mailbox"))
//    controlAwareActor ! "P[3] This thing would be nice to have "
//    controlAwareActor ! "P[0] This needs to be solved Now!! "
//    controlAwareActor ! "P[1] Do this when you have time "
//    controlAwareActor ! ManagementTicket
//  }




