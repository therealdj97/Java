//3. Write a program to calculate the Simple interest where principal, interest and time period are read using Scanner class.

import java.util.Scanner;

public class Si{

	public static void main(String arr[]){
	Scanner con = new Scanner(System.in);

	System.out.print("Enter Principle Amount ");
	int PI = con.nextInt();

	System.out.print("Enter Interest ");
	int Interest = con.nextInt();	

	System.out.print("Enter Time Period ");	
	int TimePeriod = con.nextInt();

	int SimpleInterest=(PI*Interest*TimePeriod)/100;
	System.out.println("Simple interest is "+SimpleInterest);

	}
}