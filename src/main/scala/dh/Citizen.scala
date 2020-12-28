package dh
import akka.actor.{Actor, ActorRef, ActorSystem, Props}
object  Citizen {

//  case class Vote(candidate: String)
//  case object VoteStatusRequest
//  case class VoteStatusReply(candidate:Option[String])
//
//  class Citizen extends Actor{
//    override def receive: Receive = {
//      case Vote(c)=> context.become(voted(c))
//      case VoteStatusRequest => sender() ! VoteStatusReply(None)
//    }
//    def voted(candidate: String):Receive={
//      case VoteStatusRequest => sender() ! VoteStatusReply(Some(candidate))
//    }
//  }
//  case class  AggregateVotes(citizen: Set[ActorRef])
//  class VoteAggregator extends Actor{
//
//    override def receive: Receive = awaitingCommand
//    def awaitingCommand:Receive={
//      case AggregateVotes(citizen)=>
//                                    citizen.foreach(citizenRef => citizenRef! VoteStatusRequest)
//                                    context.become(awaitingStatues(citizen,Map()))
//
//    }
//    def awaitingStatues(stillWaiting:Set[ActorRef], currentState: Map[String, Int]):Receive={
//      case VoteStatusReply(None) => sender() ! VoteStatusRequest
//      case VoteStatusReply(Some(candidate))=>
//      val newStillWaiting = stillWaiting - sender()
//      val currentVotesOFCandidate = currentState.getOrElse(candidate,0)
//      val newState = currentState + (candidate -> (currentVotesOFCandidate+1))
//      if (newStillWaiting.isEmpty)
//    {
//      println(s"aggregate poll stats:$newState")
//    }
//      else{
//      context.become(awaitingStatues(newStillWaiting,newState))
//    }
//    }
//  }
//  def main(args: Array[String]): Unit = {
//    val system = ActorSystem("ActorDemo")
//    val bob = system.actorOf(Props[Citizen])
//    val charlie = system.actorOf(Props[Citizen])
//    val daniel = system.actorOf(Props[Citizen])
//    val alice = system.actorOf(Props[Citizen])
//
//    alice ! Vote("Martin")
//    bob ! Vote("Roland")
//    charlie ! Vote("Jonas")
//    daniel ! Vote("Roland")
//    val voteAggregator = system.actorOf(Props[VoteAggregator])
//    voteAggregator ! AggregateVotes(Set(alice,bob,charlie,daniel))
//  }


}
