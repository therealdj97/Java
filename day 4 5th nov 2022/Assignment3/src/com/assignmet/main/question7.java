//7. Write a program to demonstrate switch case for displaying the corresponding day for each number.
//( eg: case 0 display the day as Sunday)

package com.assignmet.main;
import java.util.Scanner;

public class question7 {
	public static void main(String args[]) {
		System.out.println("Enter the name of Day in a Week");
		Scanner sc = new Scanner(System.in); 
		int w = sc.nextInt();
		switch(w) {
		
		case 0:System.out.println("Sunday");
		break;
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		default:System.out.println("Please enter a valid input which should be between 0 to 6");
		}
	}
	
	
}
