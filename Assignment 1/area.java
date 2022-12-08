//5. Write a program to calculate area of a rectangle.

import java.io.Console;
public class area{
	public static void main(String args[]){
	
	Console abc = System.console();
	
	System.out.println("Enter length of rectangle ");
	int l = Integer.parseInt(abc.readLine());
	System.out.println("Enter breadth of rectangle ");
	int b = Integer.parseInt(abc.readLine());
	int area = b*l;
	System.out.println("area of rectangle is "+area);
	
	}

}