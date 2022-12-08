// 7. Write a program to read the number of minutes as input. Display the given value in hours and Minutes.
import java.util.Scanner;
class min {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter minutes :");
	int mins = sc.nextInt();
	int a = mins % 60 ;
	int b = mins/60;
	System.out.println("Minuts is equal to "+b+":"+a);
	}
}