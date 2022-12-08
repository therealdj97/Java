// 4. Write a program that reads a number in inches, and convert it into metres.

import java.io.Console;
class conv {
	public static void main(String args[]){
	Console abc = System.console();
	System.out.println("Enter lenght in inches : ");
	String inch = abc.readLine();
	double a = Double.parseDouble(inch);
	double meters = a*0.0254;
	System.out.println("lenth in meters is : "+meters);
	}
}