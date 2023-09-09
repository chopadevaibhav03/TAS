package com;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
    	System.out.println("Enter sereis");
        int n = new Scanner(System.in).nextInt(); // Number of terms in the series
        double sum = calculateSeriesSum(n);

        System.out.println("Sum of the series: " + sum);
    }

    public static double calculateSeriesSum(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (i + 5.0) / i;
        }

        return sum;
    }
}