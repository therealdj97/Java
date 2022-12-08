//4. Write a program to swap 2 numbers which is read using BufferedReader class.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Swap {

	public static void main(String  args[]) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the 1st number to be swapped : ");
		int fnum = Integer.parseInt(br.readLine());

		System.out.print("Enter the 2nd number to be swapped : ");
		int snum = Integer.parseInt(br.readLine());
		int swap =0;
		swap = fnum;
		fnum = snum;
		snum = swap;

		System.out.println("1st number is "+fnum);
		System.out.println("2nd number is "+snum);

	}

}