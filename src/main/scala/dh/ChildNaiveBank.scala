package dh

import akka.actor.{Actor, ActorSystem, Props}
import dh.ChildNaiveBank.CreditCard.{AttachToAccount, CheckStatus}
import dh.ChildNaiveBank.NaiveBankAccount.{Deposit, InitializeAccount}

object ChildNaiveBank {
  object NaiveBankAccount{
    case class Deposit(amount:Int)
    case class Withdraw(amount:Int)
    case object InitializeAccount
  }
  class NaiveBankAccount extends  Actor
  {
    import NaiveBankAccount._
    import CreditCard._
    var amount =0
    override def receive: Receive = {


      case InitializeAccount=>

        val creditCardRef  =context.actorOf(Props[CreditCard],"card")
        creditCardRef ! AttachToAccount(this)
      case Deposit(funds)=> deposit(funds)
      case Withdraw(funds)=>withdraw(funds)
    }
    def deposit(funds:Int) {
      println(s"fund deposited $funds on top of $amount")
      amount += funds
    }
    def withdraw(funds:Int){
      println(s"fund withdrawn $funds on top of $amount")
      amount -= funds
    }
  }
  object CreditCard
  {
    case class AttachToAccount(bankAccount: NaiveBankAccount)
    case object CheckStatus
  }
  class CreditCard extends Actor
  {
    override def receive: Receive = {
      case AttachToAccount(account)=> context.become(attachTo(account))
    }

    def attachTo(account:NaiveBankAccount):Receive={
      case checkStatus => println(s"${self.path} you message has been processed")
        account.withdraw(1)
    }
  }
  def main(args: Array[String]): Unit =
  {
    val system = ActorSystem("ParentChildDemo")
    val bankAccountRef = system.actorOf(Props[NaiveBankAccount],"account")
    bankAccountRef ! InitializeAccount
    bankAccountRef ! Deposit(100)


    Thread.sleep(500)
    val ccSelection = system.actorSelection("/user/account/card")
    ccSelection ! CheckStatus

  }



}
