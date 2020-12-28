package dh

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import akka.event.ActorEventBus
//import dh.ChildMasterGo.WordCountMaster.{WordCountReply, WordCountTask}

object ChildMasterGo {
//object WordCountMaster{
//  case class Initialize(nChildren:Int)
//  case class WordCountTask(id:Int,text:String)
//  case class WordCountReply(id:Int,count:Int)
//
//}
//  class WordCountMaster extends Actor{
//    import WordCountMaster._
//    override def receive: Receive ={
//      case Initialize(nChildren)=>
//        println("[Master] Initializing . . .")
//        val childrenRefs = for (i<- 1 to nChildren) yield context.actorOf(Props[WordCounterWorker],s"wcw_$i")
//        context.become(withChildren(childrenRefs,0,0,Map()))
//        }
//    def withChildren(childrenRefs: IndexedSeq[ActorRef], currentChildIndex: Int, currrentTaskID: Int, requestMap: Map[Int, ActorRef]): Receive =
//    {
//      case text:String=>
//        println(s"[master] I have received: $text -I will  send it to the child $currentChildIndex")
//        val originalSender=sender()
//        val task=WordCountTask(currrentTaskID,text)
//        val childRef = childrenRefs(currentChildIndex)
//        childRef ! task
//        val nextChildIndex = (currentChildIndex+1)% childrenRefs.length
//        val newTaskID=currrentTaskID+1
//        val newRequestMap= requestMap +(currrentTaskID -> originalSender)
//        context.become(withChildren(childrenRefs,nextChildIndex,newTaskID,newRequestMap))
//      case WordCountReply(id,count)=>
//        println(s"[master] I have received a reply for task id $id with $count")
//        val originalSender = requestMap(id)
//         originalSender ! count
//        context.become(withChildren(childrenRefs,currentChildIndex,currrentTaskID,requestMap-id))
//
//    }
//  }
//
//class WordCounterWorker extends Actor {
//  override def receive: Receive = {
//    case WordCountTask(id,text)=>
//      println(s"${self.path}I have received task $id with $text")
//      sender() ! WordCountReply(id,text.split(" ").length)
//}
//}
//
//  class TestActor extends Actor{
//    import WordCountMaster._
//
//    override def receive: Receive = {
//      case "go" =>
//        val master = context.actorOf(Props[WordCountMaster],"Master")
//        master ! Initialize(3)
//        val texts = List("I love Akka","Scala is super dope","yes","me too")
//        texts.foreach(text=>master ! text)
//      case count: Int=>
//        println(s"[test actor] I received reply:$count")
//    }}
//
//  def main(args: Array[String]): Unit = {
//  val system = ActorSystem("roundRobinWordCountExcercise")
//  val testActor = system.actorOf(Props[TestActor],"testActor")
//    testActor ! "go"
//  }
}
