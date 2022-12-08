//4. Write a program to calculate the grade of a student based on the marks entered by user in each
//subject. No: of subjects is entered by the user. Program prints the grade based on the following logic.
//If the average of marks is >= 80 then prints Grade ‘A’
//If the average is <80 and >=60 then prints Grade ‘B’
//If the average is <60 and >=40 then prints Grade ‘C’
//else prints Grade ‘D’
package com.assignmet.main;
import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter number of subjects students appeared for ");
		int a = abc.nextInt();
		int s[] = new int[a];
		int sum = 0;
		double avg = 1;
		System.out.println("Enter marks");
		for(int i=0;i<a;i++ ) {
			s[i]=abc.nextInt();
			sum+=s[i];
		}
		avg=sum/a;
		System.out.println("avg is "+avg);
		if (avg>=80) {
			System.out.println("Grade A");
		}
		else if (80> avg && avg>=60) {
			System.out.println("Grade B");
		}
		else if (60> avg && avg>40) {
			System.out.println("Grade C");
		}
		else  {
			System.out.println("Grade D");
		}
	}

}
