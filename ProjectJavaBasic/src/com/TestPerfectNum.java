package com;

import java.util.Scanner;

public class TestPerfectNum {
	static boolean isPerfect(int n) {
		if(n == 1) {
			return false;
		}
		int sum = 1;
		for(int i = 2; i< n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		if(sum == n) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		System.out.println("enter number");
		int n = new Scanner(System.in).nextInt();
		
		if(isPerfect(n)) {
			System.out.println(n+" is perfect number");
		}else {
			System.out.println(n+" is not perfect:");
		}
	}

}



