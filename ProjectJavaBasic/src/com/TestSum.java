package com;

import java.util.Scanner;

public class TestSum {
	int num1,num2;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tow numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
//		sc.nextLine();
	}
	
	int sum() {
		
		int s = num1+num2;
		System.out.println("Sum of number is: "+s);
		return s;
	}
	
	int subs() {
		
		int n = num1-num2;
		System.out.println("Substraction of number is: "+n);
		return n;

	}
	
	int mult() {
		int m = num1*num2;
		System.out.println("Multiplication of number is: "+m);
		return m;
	}
	
	int div() {
		
		int d = num1/num2;
		System.out.println("Division of number is: "+d);
		return d;
	}
	
	int mod() {
		
		int
		p = num1%num2;
		System.out.println("Mod of number is: "+p);
		return p;
	}
	
public static void main(String []args) {
	
	TestSum t = new TestSum();
	t.input();
	t.sum();
	t.subs();
	t.mult();
	t.div();
	t.mod();
	}
}

/*
 public class Test{
 int n1,n2;
 
 void input(){
 Scanner sc = new Scanner (System.in);
 System.out.println("enter number");
 n1 = sc.nextInt();
 n2 = sc.nextInt();
 }
 
 void sum(){
 int s = n1+n2;
 Sout("sum is"+s)
 }
 
 psvm(String []args){
 
 Test t = new Test();
 t.input();
 t.Sum();
 }
 */
 
