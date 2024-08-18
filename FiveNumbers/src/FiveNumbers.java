import java.util.Scanner;

/* Alex Balli
   September 7, 2011
   Assignment 1, Problem 1a
   This program calculates the sum, average, product, smallest, and largest of 5 integers and how many of them were + or -
*/
public class FiveNumbers {
	public static void main (String[] args){
	// prompt user to give 5 integers
		Scanner input = new Scanner(System.in);
		System.out.println("enter 5 integers. press enter after each one");
	// get the five integers from the input
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
	// get the sum
		int num6 = (num1 + num2 + num3 + num4 + num5);
		System.out.println ("the sum is " + num6);
	// get the average
		double avg = (num6/5);
		System.out.printf ("the average is %.1f.%n", avg);
	// find product
		System.out.println("the product is " + num1 * num2 * num3 * num4 * num5);
	// find greatest of the 5 numbers
	// create variables for greatest of each comparison between numbers
		int greatest1;
		int greatest2;
		int greatest3;
		int greatest4;
	// determine if num1 or num2 is greater
		if (num1 > num2)
			greatest1 = (num1);
		else 
			greatest1 = (num2);
	// determine if the result from the first comparison or num3 is greater
		if (greatest1 > num3)
			greatest2 = (greatest1);
		else 
			greatest2 = (num3);
	// determine if second result or num4 is greater
		if (greatest2 > num4)
			greatest3 = (greatest2);
		else 
			greatest3 = (num4);
	// determine if third result or num5 is greater
		if (greatest3 > num5)
			greatest4 = (greatest3);
		else 
			greatest4 = (num5);
	// display greatest integer
		System.out.println("the greatest integer is " + greatest4);
	
	// determine smallest integer
	// create variables for the smallest integer of each comparison
		int least1;
		int least2;
		int least3;
		int least4;
	// determine if num1 or num2 is smaller
		if (num1 < num2)
			least1 = (num1);
		else
			least1 = (num2);
	// determine if least1 or num3 is smaller
		if (least1 < num3)
			least2 = (least1);
		else
			least2 = (num3);
	// determine if least2 or num4 is smaller
		if (least2 < num4)
			least3 = (least2);
		else
			least3 = (num4);
	// determine if least3 or num5 is smaller
		if (least3 < num5)
			least4 = (least3);
		else
			least4 = (num5);
	// display smallest number
		System.out.println ("the smallest number is " + least4);
	
	// find how many positive integers there are
	// create variables for if a integer is positive or not
		int pos1;
		int pos2;
		int pos3;
		int pos4;
		int pos5;
	// is num1 positive?
		if (num1 > 0)
			pos1 = (1);
		else 
			pos1 = (0);
	// is num2 positive?
		if (num2 > 0)
			pos2 = (1);
		else 
			pos2 = (0);
	// is num3 positive?
		if (num3 > 0)
			pos3 = (1);
		else 
			pos3 = (0);
	// is num4 positive?
		if (num4 > 0)
			pos4 = (1);
		else 
			pos4 = (0);
	// is num5 positive?
		if (num5 > 0)
			pos5 = (1);
		else 
			pos5 = (0);
	// display how many positive numbers there are
		int posfin = (pos1 + pos2 + pos3 + pos4 + pos5 );
		System.out.println("there are " + posfin + " positive numbers");
	
	// find how many negative numbers there are
	// create variables for if integer is negative or not
		int neg1;
		int neg2;
		int neg3;
		int neg4;
		int neg5;
	// is num1 negative?
		if (num1 < 0)
			neg1 = (1);
		else
			neg1 = (0);
	// is num1 negative?
		if (num2 < 0)
			neg2 = (1);
		else
			neg2 = (0);
	// is num3 negative?
		if (num3 < 0)
			neg3 = (1);
		else
			neg3 = (0);
	// is num4 negative?
		if (num4 < 0)
			neg4 = (1);
		else
			neg4 = (0);
	// is num5 negative?
		if (num5 < 0)
			neg5 = (1);
		else
			neg5 = (0);
	// display how many negative numbers there are
		int negfin = (neg1 + neg2 + neg3 + neg4 + neg5);
		System.out.println("there are " + negfin + " negative numbers");
	
	}


}
