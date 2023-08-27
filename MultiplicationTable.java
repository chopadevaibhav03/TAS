import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number");
        int num = sc.nextInt();
        System.out.println("Enter the limit for multiplication:");
        int limit = sc.nextInt();
        System.out.println("Multiplication table for " + num + " up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}

