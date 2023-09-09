package com;

import java.util.Scanner;

public class TestFarToCelcius {
	public static void main (String []args) {
		float far,cel;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter celcius ");
		cel = sc.nextFloat();
		
		far = ((cel*9/5)+32);
		
		System.out.println(far+" Fahrenheit");
	}


}
