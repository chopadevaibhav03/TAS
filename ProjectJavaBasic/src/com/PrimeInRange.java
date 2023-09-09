package com;
import java.util.Scanner;
//
//public class PrimeInRange {

//	public static boolean isPrime(int num) {
//		if(num <= 1) {
//		return false;
//		}
//		
//		for (int i=2;i<= Math.sqrt(num);i++) {
//			if(num % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter LowerLimit");
//		int lowerLimit = sc.nextInt(); 
//		System.out.println("enter upperlimit:");
//		int upperlimit = sc.nextInt();
//		int sum = 0;
//		int count;
//		
//		for(int i = lowerLimit; i<=upperlimit;i++) {
//		if(isPrime(i)) {
//			System.out.println(i +"");
//			
//			}
//		}
//		sc.close();
//	}
//
//}
	//Print N Prime Numbers

	

//public class PrimeInRange {
//
//    public void checkPrime(int num1, int num2) {
//        for (int i = num1; i <= num2; i++) {
//            if (i <= 1) {
//                continue; // Skip 1, as it's not a prime number
//            }
//            
//            int flag = 0;
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Range: ");
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        PrimeInRange t = new PrimeInRange();
//        t.checkPrime(n1, n2);
//    }
//}



public class PrimeInRange {
    public int countPrimes(int num1, int num2) {
        int count = 0;

        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Print the prime number
                count++;
            }
        }

        return count;
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        PrimeInRange primeInRange = new PrimeInRange();
        int primeCount = primeInRange.countPrimes(n1, n2);

        System.out.println("\nThe number of prime numbers between " + n1 + " and " + n2 + " is: " + primeCount);
    }
}