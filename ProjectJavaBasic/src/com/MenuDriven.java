package com;

import java.util.Scanner;

public class MenuDriven {
	
	int countDigit(int num) {
		int count = 0;
		while(num > 0) {
			count++;
			num = num/10;
		}
		return count;
	}
	int power(int no,int p) {
		int power = 1;
		for(int i=1;i<=p;i++) {
			power = power*no;
		}
		return power;
	}
	int findFactorial(int f) {
		int fact = 1;
		while(f!=0) {
			fact = fact*f;
			f--;
		}
		return fact;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		MenuDriven m = new MenuDriven();
//		System.out.println("Enter number");
//		int n = sc.nextInt();
//		System.out.println("Enter power of number");
//		int p = sc.nextInt();
		
		String str = null;

		
		do {
			System.out.println("1.how many digit in number: ");
			System.out.println("2.calculate power of number: ");
			System.out.println("3.factorial of number: ");
			
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enetr number: ");
				int num = sc.nextInt();
				System.out.println("Digits in number is: "+m.countDigit(num));
				break;
			case 2:
				System.out.println("Enetr number: ");
				int no = sc.nextInt();
				int p = sc.nextInt();
				System.out.println("power of number: "+m.power(no,p));
				break;
				
			case 3:
				System.out.println("Enetr number: ");
				int f = sc.nextInt();
				System.out.println("factorial of number is: "+m.findFactorial(f));
				break;		
			}
			System.out.println("do you want continue:");
			str = sc.next();

		}while(str.equals("yes") );
	}

}
