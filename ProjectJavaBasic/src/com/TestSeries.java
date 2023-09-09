package com;

import java.util.Scanner;

public class TestSeries {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers...:");
		 int n = sc.nextInt();

	        int term = 1;
	        int sum = 0;
//	        int i = 0;
//
//	        while (i < n) {
//	            System.out.print(term);
//	            if (i < n - 1) {
//	                System.out.print(", ");
//	            }
//	            sum += term;
//	            term = term * 10 + 1;
//           i++;
//	        }
//
//	        System.out.println("\nSum of the series: " + sum);
	        
	        int series;
	        for(int i=0;i<term;i++) {
	        	series = (int)(i+Math.pow(2, i));
	        	System.out.println(series+",");
	        	sum = sum+series;
	        }
	        System.out.println("\n");
	        sc.close();
	    }
	}

/*
import java.util.Scanner;

public class SeriesUsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int term = 1;
        int sum = 0;
        int i = 0;

        while (i < n) {
            System.out.print(term);
            if (i < n - 1) {
                System.out.print(", ");
            }
            sum += term;
            term = term * 10 + 1;
            i++;
        }

        System.out.println("\nSum of the series: " + sum);

        scanner.close();
    }
}
*/