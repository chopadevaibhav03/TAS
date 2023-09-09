package com;

import java.util.Scanner;

public class TestCelToFahrenheit {
	public static void main(String []args) {
		
		float far,cel;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Fahrenheit ");
		far = sc.nextFloat();
		
		cel = ((far - 32)*5/9);
		
		System.out.println(cel+" celcius");
	}

}
