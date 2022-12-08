//5. Write a program to calculate area and circumference of a circle.

import java.util.Scanner;
class circle{
	public static  void main (String args[]){
	Scanner ab = new Scanner(System.in);
	System.out.println("Enter Radius of circle");
	String r = ab.next();
	Double rad = Double.parseDouble(r);
	System.out.println(rad);
	Double Area = 3.14*rad*rad;
	Double circ = 3.14*2*rad;
	System.out.println("Area of circle is"+'\t'+Area);
	System.out.println("Circumfurance of circle is"+'\t'+circ);
	}
}