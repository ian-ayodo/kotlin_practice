package fundamentals

import com.sun.jdi.IntegerValue
import javax.print.attribute.IntegerSyntax

class Operators(){

    fun mathematical_operations()  {
        var result = 0

        print("Enter first number : ")
        var first_number: Int = Integer.valueOf(readln())

        print("Enter second number : ")
        var second_number: Int = Integer.valueOf(readln())

        println("enter one of these operations : Add, Multiply, Divide,Subtract or Break to end the operation")
        print("Enter operation : ")

        var operation = readln()

        when (operation) {
            "Add" -> result = first_number + second_number
            "Multiply" -> result = first_number * second_number
            "Divide" -> result = try {
                first_number / second_number
            } catch (e: ArithmeticException) {
                second_number
            }

            "Subtract" -> result = first_number - second_number
            else -> println("You have to enter one of these operations : Add, Multiply, Divide or Subtract")
        }

    }

}