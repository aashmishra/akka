package dh

object CitizenStateless {
//  case class Vote(candidate: String)
//  case object VoteStatusRequest
//  case class VoteStatusReply(candidate:Option[String])
//
//  class Citizen extends Actor{
//    var candidate:Option[String] = None
//    override def receive: Receive = {
//      case Vote(c)=> candidate = Some(c)
//      case VoteStatusRequest => sender() ! VoteStatusReply(candidate)
//    }
//  }
//  case class  AggregateVotes(citizen: Set[ActorRef])
//  class VoteAggregator extends Actor{
//    var stillWaiting: Set[ActorRef]=Set()
//    var currentState: Map[String,Int]= Map()
//    override def receive: Receive = {
//      case AggregateVotes(citizen) =>
//        stillWaiting= citizen
//        citizen.foreach(citizenRef => citizenRef! VoteStatusRequest)
//      case VoteStatusReply(None) =>
//      case VoteStatusReply(Some(candidate))=>
//        val newStillWaiting = stillWaiting - sender()
//        val currentVotesOFCandidate = currentState.getOrElse(candidate,0)
//        currentState = currentState + (candidate -> (currentVotesOFCandidate+1))
//        if (newStillWaiting.isEmpty)
//        {
//          println(s"aggregate poll stats:$currentState")
//        }
//        else{
//          stillWaiting=newStillWaiting
//        }
//
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
