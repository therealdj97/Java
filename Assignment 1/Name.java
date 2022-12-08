//2. Write a program to print the name of the user using Console class.

import java.io.Console;

public class Name {

public static void main(String arr[]){
	Console con = System.console();
	System.out.print("Enter your name :");
	String uname = con.readline();
	System.out.println("your name is " + uname);
	
	}

}