package com;

import java.util.Scanner;

public class Items {
	public static void main(String []agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total cost of items purchased: ");
        double totalCost = sc.nextDouble();
        double discountRate = 0;

        if (totalCost < 2000) {
            discountRate = 0.05; // 5% discount
        } else if (totalCost >= 2000 && totalCost < 5000) {
            discountRate = 0.25; // 25% discount
        } else if (totalCost >= 5000 && totalCost < 10000) {
            discountRate = 0.35; // 35% discount
        } else if (totalCost >= 10000) {
            discountRate = 0.50; // 50% discount
        }
	
        double discountAmount = totalCost * discountRate;
        double amountToBePaid = totalCost - discountAmount;
        
        System.out.println("Total Cost: Rs. " + totalCost);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Amount to be Paid: Rs. " + amountToBePaid);

        sc.close();
	}
}



/*
 import java.util.Scanner;

public class ClothShowroomDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the total cost of items purchased
        System.out.print("Enter the total cost of items purchased: ");
        double totalCost = input.nextDouble();

        // Calculate the discount based on the total cost
        double discountRate = 0;
        if (totalCost < 2000) {
            discountRate = 0.05; // 5% discount
        } else if (totalCost >= 2000 && totalCost < 5000) {
            discountRate = 0.25; // 25% discount
        } else if (totalCost >= 5000 && totalCost < 10000) {
            discountRate = 0.35; // 35% discount
        } else if (totalCost >= 10000) {
            discountRate = 0.50; // 50% discount
        }

        // Calculate the amount to be paid after applying the discount
        double discountAmount = totalCost * discountRate;
        double amountToBePaid = totalCost - discountAmount;

        // Display the data
        System.out.println("Total Cost: Rs. " + totalCost);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Amount to be Paid: Rs. " + amountToBePaid);

        input.close();
    }
}

 */

