package com;

import java.util.Scanner;

public class MaxNum {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		System.out.println("Enter 1st numbers:");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd numbers:");
		int n2 = sc.nextInt();
		System.out.println("Enter 3rd numbers:");
		int n3 = sc.nextInt();
		
		int max = n1;
		if(n2 > max) {
			max = n2;
		}if(n3 > max) {
			max = n3;
		}
		System.out.println("The Max numbers is :"+ max);

	}

}
