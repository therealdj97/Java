//3. Write a program that averages the rainfall for three months, April, May, and June. Declare and
//initialize a variable to the rainfall for each month. Compute the average, and write out the results, in
//the following format:

//Rainfall for April : 12
//Rainfall for May : 14
//Rainfall for June : 8
//Average rainfall : 11.333333

//To get the numerical values to line up use the tabulation character '\t' as part of the character string in
//the output statements.

class avg{
public static void main(String args[]){
	int apr = 12;
	int may = 14;
	int june = 8;
	double a = (apr+may+june)/3.0;
	System.out.println("Rainfall for April"   + '\t'  +apr);
	System.out.println("Rainfall for May"+ '\t'  +may);
	System.out.println("/Rainfall for June"+ '\t'  +june);
	System.out.println("calculared avg is"+ '\t'  +a);
	}
}