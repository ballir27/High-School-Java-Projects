import java.util.Scanner;
/* Alex Balli
 * June 23, 2011
 * assignment 1, problem 2
 * This program determines the diameter, circumference, and area of a circle when given a radius
*/

public class circle{
	public static void main (String[] args){
// prompt user to give the radius of a circle
	Scanner input = new Scanner(System.in);
	System.out.println("enter the radius of a circle");
// define variable for give radius
		int number1 = input.nextInt();
// determine and give diameter
	System.out.println("the diameter is " + number1 * 2);
// determine and give circumference
	System.out.println("the circumference is " + number1 * MATH.PI * 2);
// determine and give area
	System.out.println("the area of the circle is " + number1 * number1 * MATH.PI);
	
	}	
}


