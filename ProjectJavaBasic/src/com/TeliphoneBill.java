package com;

import java.util.Scanner;

public class TeliphoneBill {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of calls: ");
        int numberOfCalls = sc.nextInt();
        double totalBill = 0;

        if (numberOfCalls <= 80) {
            totalBill = numberOfCalls * 2.50;
        } else if (numberOfCalls > 80 && numberOfCalls <= 160) {
            totalBill = 80 * 2.50 + (numberOfCalls - 80) * 0.60;
        } else if (numberOfCalls  > 160 && numberOfCalls <= 320) {
            totalBill = 80 * 2.50 + 80 * 0.60 + (numberOfCalls - 160) * 0.50;
        } else {
            totalBill = 80 * 2.50 + 80 * 0.60 + 160 * 0.50 + (numberOfCalls - 280) * 0.40;
        }
        
        System.out.println("Total bill amount: Rs. " + totalBill);

        sc.close();
		
	}

}


