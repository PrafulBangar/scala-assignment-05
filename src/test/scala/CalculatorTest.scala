import org.scalatest.WordSpec


class CalculatorTest extends  WordSpec {
  val calculate: Calculator = new Calculator

val firstNumber=20
  val secondNumber=10

  "Addition of Two Numbers" should {

    "Result of Addition" in {
      assert(calculate.addOperation(firstNumber,secondNumber) == 30)
    }
  }

  "Subtraction of Two Numbers" should {

    "Result of Subtraction" in {
      assert(calculate.subOperation(firstNumber,secondNumber) == 10)
    }
  }

  "Multiplication of Two Numbers" should {

    "Result of Multiplication" in {
      assert(calculate.multiplicationOperation(firstNumber,secondNumber) == 200)
    }
  }

  if(secondNumber!=0) {
    "Division of Two Numbers" should {

      "Result of Divition" in {
        assert(calculate.devideOperation(firstNumber, secondNumber) == 2)
      }
    }
  }
    else
    {
      "Division of Two Numbers" should {

        "Result of Divition" in {
          println("Denominator should not be 0")
        }
      }


    }
}