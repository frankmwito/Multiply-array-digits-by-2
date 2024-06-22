//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package main

import java.util.*

fun solution(arr: Array<Int>): Array<Int> {
    // Create a new array to store the doubled values
    val result = Array(arr.size) { 0 }

    // Loop through each element in the input array, double it, and store it in the result array
    for (i in arr.indices) {
        result[i] = arr[i] * 2
    }

    return result
}

fun main() {
    val reader = Scanner(System.`in`)
    println("Enter any three numbers:")

    // Read three integers from the user into an array
    val arr = Array(3) { reader.nextInt() }

    // Call the solution function and get the result
    val doubledArr = solution(arr)

    // Print the resulting array
    println("Doubled numbers: ${doubledArr.joinToString(", ")}")
}
