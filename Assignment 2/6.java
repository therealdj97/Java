//6. Write a program to convert a given Fahrenheit value into celsius value.
//(C = (F – 32) * 5 / 9)

import 
java.util.Scanner;
class temp{
	public static void main(String args[]){
	Scanner abc = new Scanner(System.in);
	System.out.println("Enter the temperature in Fahrenheit  :");
	String c = abc.next();
	Double f = Double.parseDouble(c);
	Double celc = (f-32)*5/9;
	System.out.println("temp in celcius is"+'\t'+celc);
	}
}