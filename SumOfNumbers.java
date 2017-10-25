import java.util.Scanner;

/** Program: Sum of Numbers
* File: SumOfNumbers.java
* Summary: Asks user to enter 5 positive number and get the sum of them.
* Author: Chris Hyde
* Date: October 24, 2017 
**/


public class SumOfNumbers {

	public static void main(String[] args) {
		// Import the scanner class for user input.
		Scanner input = new Scanner(System.in);

		// Integer variables.
		int number, firstDigit, secondDigit, thirdDigit, fourthDigit, fithDigit, sum;

		// Output a request for user input to the console.
		System.out.println("Please enter five digit positive number (e.g. 12345):");

		// Set the integer number variable to the input of the user.
		number = input.nextInt();

		// Calculate each digit out of the user defined number variable.
		firstDigit = number / 10000 % 10;
		secondDigit = number / 1000 % 10;
		thirdDigit = number / 100 % 10;
		fourthDigit = number / 10 % 10;
		fithDigit = number % 10;

		// Get the sum of each digit that comprised the user defined number variable.
		sum = firstDigit + secondDigit + thirdDigit + fourthDigit + fithDigit;

		// Output the answer to the console.
		System.out.println("The sum of the digits is: " + firstDigit + " + " + secondDigit + " + " + thirdDigit + " + "
				+ fourthDigit + " + " + fithDigit + " = " + sum);

		// Close the Scanner class
		input.close();

	}

}
