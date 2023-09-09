package com;

import java.util.Scanner;

/*
 * .Write a program to input x and n.Find and print the 
sum of the following series upto limit n.
S=x-x^3+x^5-x^7+4...... ..n terms
*/
public class PowerSum {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        double sum = 0;
        int sign = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += Math.pow(x, 2 * i + 1) * sign;
                sign *= -1;
            } else {
                sum += 4;
            }
          }
        System.out.println("Sum of series: "+sum);
        sc.close();
		}
	
}

