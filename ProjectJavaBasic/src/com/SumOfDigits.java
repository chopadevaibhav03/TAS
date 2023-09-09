package com;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");

		int n = scan.nextInt();
		int sum = 0;
		
		while(n!=0) {
			int digit = n%10;
			sum += digit;
			n = n/10;
		}
		System.out.println("Sum of digits is: "+sum);
	}
}
