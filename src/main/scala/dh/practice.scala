package dh

object practice {

  def isPrime(n:Int):Boolean = {
    def isPrimeUntil(t:Int): Boolean =
      if(t<1) true
      else n%t!=0 && isPrimeUntil(t-1)
    isPrimeUntil(n/2)
  }

  def fibonacci(n:Int):Int=
    if(n<=2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  def main(args: Array[String]): Unit = {
    println(isPrime(5))
    println(fibonacci(8))
  }




}
