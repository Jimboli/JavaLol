/* Name: Ishan Prabhu
* Assignment: Sum of Digits
* Class: CIS 016 Programming with Java
* Date: October 4
* */


package edu.pcc.java.Assignment04;

import java.util.Scanner;


public class SumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter an integer: ");
     	int number = input.nextInt();
		
		input.close();

		int total = sumDigits(number);

		System.out.println("The sum of the digits in " + number + " is " + total + ".");
	}

	public static int sumDigits(int n) {
		int total = 0;

		while (n >= 10 || n <= -10) {
			int item = n % 10;

			total = item + total;
			n = n / 10;
		}

		if (n < 10 && n > -10) {
			total = total + n;
		}

		return total;


		}
	


}