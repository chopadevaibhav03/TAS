package com;

import java.util.Scanner;

public class PositiveAndNegateive {
	public static void main(String []args) {
		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			System.out.println("Number is positive");
		}else if(num < 0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is eqal to zero;");

		}
	}

}
