//1. Write a program to add 2 numbers which are given as commandline arguments.

class Sum{
public static void main(String arr[]) {
	int fnum = Integer.parseInt(arr[0]);
	int snum = Integer.parseInt(arr[1]);
	int total = fnum + snum;
	System.out.println("addition is : " + total);
	}
}