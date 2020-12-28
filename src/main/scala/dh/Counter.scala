package dh

import akka.actor.{Actor, ActorSystem, Props,ActorRef}

object Counter {

// object Apple
//{
//
//  case object IncreaseCounter
//
//  case object DecreaseCounter
//  case object Print
//
//}
//  import Apple._
//  class Apple extends Actor {
//    var counter=0
//    def receive = {
//
//      case Print =>println(s"Hi I got the messge : $counter")
//      case IncreaseCounter=>{
//       counter  = counter+1
//        println(s"value increased :$counter")
//      }
//      case DecreaseCounter=>{
//        counter  = counter-1
//        println(s"value decreased :$counter")
//      }
//      case _ => println("Error: message not recognized")
//    }
//  }
//
//
//  object BankAccount {
//    case class Deposit(amount:Int)
//    case class Withdraw(amount:Int)
//    case class Statement(amount:Int)
//    case class TransactionSuccess(message: String)
//    case class TransactionFailure(message: String)
//  }
//  class BankAccount extends Actor
//  {
//    var fund=0
//    import BankAccount._
//    override def receive: Receive = {
//      case Deposit(amount) =>
//        if (amount < 0) sender() ! TransactionFailure("Invalid Transaction Amount")
//        else {
//          fund=fund+amount
//          sender() ! TransactionSuccess(s"Deposited :${amount}amount and total amount is :$fund")
//        }
//      case Withdraw(amount)=>
//        if (amount < 0) sender() ! TransactionFailure("Invalid Transaction Amount")
//        else if (fund<amount) sender() ! TransactionFailure("No Sufficient funds Available")
//        else {
//          fund=fund-amount
//          sender() ! TransactionSuccess(s"Withdrawn :${amount}amount and total amount is :$fund")
//        }
//      case Statement => sender() ! s"your balanace is :$fund"
//      case TransactionSuccess(message)=> println(message)
//      case TransactionFailure(message)=>println(message)
//    }
//  }
//  object Person{
//    case class LiveTheLife(account: ActorRef)
//
//  }
//  class Person extends Actor
//  {
//    import Person._
//    import BankAccount._
//
//    override def receive: Receive = {
//      case LiveTheLife(account)=> account ! Deposit(10000)
//                                            account ! Withdraw(9000)
//                                            account ! Withdraw(500)
//                                            account ! Statement
//                                            account ! Withdraw(9000)
//
//      case msg=>println(msg.toString)
//                                    }
//  }
//
//
//  //  object Apple {
//  //    def props(counter: Integer) =  Props (new Apple)
//  //  }
//  def main(args: Array[String]): Unit = {
//    val system = ActorSystem("ActorDemo")
//    val simpleActor = system.actorOf(Props[Apple],name = "simpleActor")
////    simpleActor ! "hello"
////    (1 to 5 ).foreach(_=>simpleActor ! IncreaseCounter)
////    (1 to 3 ).foreach(_=>simpleActor ! DecreaseCounter)
////    simpleActor ! Print
//    val account = system.actorOf(Props[BankAccount],"BankAccount")
//    val person = system.actorOf(Props[Person],"Billionaire")
//    person ! LiveTheLife(account)
//  }

}

