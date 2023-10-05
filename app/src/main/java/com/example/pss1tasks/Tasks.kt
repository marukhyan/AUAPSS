package com.example.pss1tasks

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.Scanner
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    // Task 1: Declare an array and a list of your choice, initialize them with values, and print the elements.
    println("Task 1")
    task1()

    // Task 2: Create a string variable and perform various string manipulations such as concatenation, substring extraction, and changing case, then print the modified string.
    println("Task 2")
    task2()

    // Task 3: Declare a map with key-value pairs and iterate through it to print both keys and values.
    println("Task 3")
    task3()

    // Task 4: Write a function that takes an integer as input and returns a string indicating whether it's positive, negative, or zero. Call this function with different integer inputs and print the results.
    println("Task 4")
    task4()

    // Task 5: Create a program that asks the user for their name and age, then prints a personalized greeting with their name and a message based on their age.
    println("Task 5")
    task5()

    // Task 6 Write a function that takes two numbers as input and divides them. Implement error handling to handle division by zero and print an appropriate message.
    println("Task 6")
    try {
        val result = task6(10.0, 2.0)
        println("Result: $result")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    // Task 7: Get the current date and time, format it, and print it.
    println("Task 7")
    task7()

    // Task 8: Create a program that asks the user to input a list of numbers, then use a lambda function to filter and print only the prime numbers from the list.
    println("Task 8")

    val scanner = Scanner(System.`in`)
    print("Enter a list of numbers separated by spaces: ")
    val input = scanner.nextLine()
    val numbers = input.split(" ").map { it.toInt() }
    val primeNumbers = numbers.filter { task8(it) }
    println("Prime Numbers: $primeNumbers")
}

// Task 1
fun task1() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val list = listOf("apple", "banana", "cherry")
    println("Array: ${array.joinToString()}")
    println("List: ${list.joinToString()}")
}

// Task 2
fun task2() {
    var originalString = "Hello, World!"
    originalString += " Welcome to Kotlin."
    val substring = originalString.substring(0, 5)
    val uppercaseString = originalString.toUpperCase()
    println("Modified String: $originalString")
    println("Substring: $substring")
    println("Uppercase: $uppercaseString")
}

// Task 3
fun task3() {
    val map = mapOf("Kotlin" to 10, "Java" to 8, "Python" to 7)
    for ((key, value) in map) {
        println("Key: $key, Value: $value")
    }
}


// Task 4
fun task4() {
    fun checkNumberSign(number: Int): String {
        return when {
            number > 0 -> "Positive"
            number < 0 -> "Negative"
            else -> "Zero"
        }
    }

    val num1 = 5
    val num2 = -3
    val num3 = 0

    println("${num1} is ${checkNumberSign(num1)}")
    println("${num2} is ${checkNumberSign(num2)}")
    println("${num3} is ${checkNumberSign(num3)}")
}

// Task 5
fun task5() {
    val scanner = Scanner(System.`in`)
    print("Enter your name: ")
    val name = scanner.nextLine()
    print("Enter your age: ")
    val age = scanner.nextInt()

    println("Hello, $name!")
    println("You are $age years old.")
    if (age < 18) {
        println("You are a minor.")
    } else {
        println("You are an adult.")
    }
}

// Task 6
fun task6(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Division by zero is not allowed.")
    }
    return a / b
}

// Task 7 Get the current date and time, format it, and print it.
@RequiresApi(Build.VERSION_CODES.O)
fun task7() {
    val currentDateTime = LocalDateTime.now()
    val formattedDateTime = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
    println("Current Date and Time: $formattedDateTime")
}

// Task 8
fun task8(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}
