object Main {
    def main(args: Array[String]) {
        var ch: Char = 0
        var numOne: Double = 0
        var numTwo: Double = 0
        var res: Double = 0

        print("Choose operation to perform: ")
        ch = scala.io.StdIn.readChar()

        print("Enter first number: ")
        numOne = scala.io.StdIn.readDouble()

        print("Enter second number: ")
        numTwo = scala.io.StdIn.readDouble()

        ch match {
            case '+' => res = addTwoValues(numOne, numTwo)
            case '-' => res = substractTwoValues(numOne, numTwo)
            case '*' => res = multiplyTwoValues(numOne, numTwo)
            case '/' => res = divideTwoValues(numOne, numTwo)
            case _=> printf("Invalid Operation!")
        }

        println("Result is: " + res)
    }

    def addTwoValues(one: Double, two: Double): Double = {
        var sum: Double = one + two

        sum
    }

    def substractTwoValues(one: Double, two: Double): Double = {
        var sub: Double = one - two

        sub
    }

    def multiplyTwoValues(one: Double, two: Double): Double = {
        var multi: Double = one * two

        multi
    }

    def divideTwoValues(one: Double, two: Double): Double = {
        var div: Double = one / two

        div
    }    
}
