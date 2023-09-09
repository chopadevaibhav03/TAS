package com;
//
//public class TestArmstrong {
//
//	int digitCount(int num)
//	{
//		int count=0;
//		while(num!=0)
//		{
//			count++;
//			num/=10;
//		}
//		return count;
//	}
//	int power(int digit,int count)
//	{ int result=1;
//		for(int i=1;i<=count;i++)
//		{
//			result*=digit;
//		}
//		return result;
//	}
//	 void findArmstrong(int num)
//	{
//		int count=digitCount(num);
//		int sum=0;
//		int m=num;
//		while(num!=0)
//		{
//			
//			int digit=num%10;
//			sum=sum+power(digit,count);
//			num/=10;
//		}
//		
//		if(sum==m)
//			System.out.println("Armstrong number");
//		else
//			System.out.println("Not Armstrong number");
//	}
//	
//	public static void main(String[] args) {
//		
//		TestArmstrong ob=new TestArmstrong();
//		ob.findArmstrong(153);
//		ob.findArmstrong(151);
//		ob.findArmstrong(1634);
//
//	}
//
//}

//.......Amstrong between Range...................
import java.util.Scanner;

public class TestArmstrong {
    int digitCount(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    int power(int digit, int count) {
        int result = 1;
        for (int i = 1; i <= count; i++) {
            result *= digit;
        }
        return result;
    }

    void findArmstrong(int num) {
        int count = digitCount(num);
        int sum = 0;
        int m = num;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + power(digit, count);
            num /= 10;
        }

        if (sum == m)
            System.out.println(m + " is an Armstrong number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();

        TestArmstrong ob = new TestArmstrong();
        for (int i = start; i <= end; i++) {
            ob.findArmstrong(i);
        }
        sc.close();
    }
}
