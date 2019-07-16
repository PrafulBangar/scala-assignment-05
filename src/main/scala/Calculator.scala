class Calculator {


  def addOperation(number1:Int,number2:Int):Int=
  {
    number1+number2
  }
  def subOperation(number1:Int,number2:Int):Int=
  {
    number1-number2
  }
  def multiplicationOperation(number1:Int,number2:Int):Int=
  {
    number1*number2
  }
  def devideOperation(number1:Int,number2:Int):Int=
  {
    require(number2!=0,"Denominator should not be zero")
    number1/number2
  }
}
/*
object Calcuculator extends  App{

  val obj =new Calculator
  println(obj.addOperation(3,5))
  println(obj.subOperation(7,2))
  println(obj.multiplicationOperation(3,7))
  println(obj.devideOperation(10,0))
}
*/
