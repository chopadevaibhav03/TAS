package com;

import java.util.Scanner;

public class GradeOfStudents {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);	
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		if(marks > 90) {
			System.out.println("Grade A");
		}else if(marks > 75 && marks < 90 ) {
			System.out.println("Grade B");
		}else if(marks > 60 && marks < 75 ) {
			System.out.println("Grade c");
		}else if(marks > 45 && marks < 60 ) {
			System.out.println("Grade D");
		}else if(marks >= 35 && marks < 45 ) {
			System.out.println(" Need Improvement");
		}else if(marks < 35 ) {
			System.out.println("Fail:");
		}else {
			System.out.println("Dont woory everything will be fine:");
		}

	}
	

}
