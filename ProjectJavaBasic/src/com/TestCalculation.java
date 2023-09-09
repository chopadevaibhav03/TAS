package com;

import java.util.Scanner;

public class TestCalculation {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Select an arithmetic operation:");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");

	            int choice = scanner.nextInt();

	            if (choice == 5) {
	                System.out.println("Exiting the program...");
	                break;
	            }

	            System.out.print("Enter the first number: ");
	            double num1 = scanner.nextDouble();

	            System.out.print("Enter the second number: ");
	            double num2 = scanner.nextDouble();

	            switch (choice) {
	                case 1:
	                    System.out.println("Result: " + (num1 + num2));
	                    break;
	                case 2:
	                    System.out.println("Result: " + (num1 - num2));
	                    break;
	                case 3:
	                    System.out.println("Result: " + (num1 * num2));
	                    break;
	                case 4:
	                    if (num2 != 0) {
	                        System.out.println("Result: " + (num1 / num2));
	                    } else {
	                        System.out.println("Error: Cannot divide by zero!");
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }

	        scanner.close();
	    }
	}
