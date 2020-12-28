package dh

import akka.actor.{Actor, ActorLogging, ActorSystem, Props, Terminated}
import akka.routing.{ActorRefRoutee, RoundRobinGroup, RoundRobinPool, RoundRobinRoutingLogic, Router}

object Routers {
//class Master extends  Actor{
//
//  // step 1 create routees
//  // 5 actor routees based off slaves actors
//  private val slaves = for (i<- 1 to 5) yield {
//    val slave = context.actorOf(Props[Slave],s"slave_$i")
//    context.watch(slave)
//    ActorRefRoutee(slave)
//  }
//  //define router
//  private val router = Router(RoundRobinRoutingLogic(),slaves)
//
//  override def receive: Receive = {
//    case Terminated(ref)=> router.removeRoutee(ref)
//      val newSlave = context.actorOf(Props[Slave])
//      context.watch(newSlave)
//      router.addRoutee(newSlave)
//      // step 3  - route the message
//    case message => router.route(message,sender())
//
//  }
//}
//
//  class Slave extends Actor with ActorLogging{
//    override def receive: Receive = {
//      case message=> log.info(message.toString)
//    }
//  }
//  def main(args: Array[String]): Unit = {
//  val system = ActorSystem("RouterDemo")
//    val master = system.actorOf(Props[Master])
//    for (i <- 1 to 10){
//      master ! s"[$i]Hello from the world"
//    }
//
//    /**
//      * Router actor with its own children
//      * Pool Router
//      */
//    val poolMaster  = system.actorOf(RoundRobinPool(5).props(Props[Slave]),"simplePoolMaster")
//    for (i <- 1 to 10){
//      poolMaster ! s"[$i]Hello from the world"
//    }
//
//    /**
//      * Method #3 - router with actors created elsewhere
//      * Group router
//      */
//
//    //-- in another part of my application
//    val slaveList = (1 to 5).map(i=>system.actorOf(Props[Slave],s"slave_$i")).toList
//
//    //need there paths
//    val slavePaths = slaveList.map(slaveRef=>slaveRef.path.toString)
//
//    //2.1 in the ode
//    val groupMaster = system.actorOf(RoundRobinGroup(slavePaths).props())
//
//    for(i<- 1 to 10)
//      {
//        groupMaster ! s"[$i]Hello from the world"
//      }
//  }

}

