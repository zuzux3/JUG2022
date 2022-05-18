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
            case '+' => res = numOne + numTwo
            case '-' => res = numOne - numTwo
            case '*' => res = numOne * numTwo
            case '/' => res = numOne / numTwo
            case _=> printf("Invalid Operation!")
        }

        println("Result is: " + res)
}
