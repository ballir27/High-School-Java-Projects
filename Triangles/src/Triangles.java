import java.util.Scanner;

/* Alex Balli
   September 15, 2011
   Assignment 2, Problem 4
   This program determines if 3 sides will form a triangle and if they do, whether the triangle is acute, right, or obtuse
*/
public class Triangles {
	public static void main (String[] args){
	
		//prompt user to enter 3 numbers
		Scanner input = new Scanner(System.in);
		System.out.println("enter the three lengths");
		
		//define variables
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		int out;
		int grt1;
		int cside;
		int bside;
		int aside;
		
		// determine longest side or "c"
		if (side1 >= side2)
			grt1 = (side1);
		else 
			grt1 = (side2);

		if (grt1 > side3)
			cside = (grt1);
		else 
			cside = (side3);
		
		// determine which sides are the 2 shorter side or "a" and "b"
		if (side1 < cside)
			aside = (side1);
		else 
			aside = (side2);
	
		if (side3 < cside)
			bside = (side3);
		else
			bside = (side2);
		
		// determine if the 3 sides can form a triangle
		if (side1 + side2 <= side3)
			out = (0);
		else if (side2 + side3 <= side1)
			out = (0);
		else if (side1 + side3 <= side2)
			out = (0);
	
		// determine if the 3 sides form an acute triangle
		else if (aside * aside + bside * bside > cside * cside)
			out = (1);
	
		// determine if the 3 sides form a right triangle
		else if (aside * aside + bside * bside == cside * cside)
			out = (2);
	
		// assume any triangle that doesn't fall under previous categories is obtuse
		else
			out = (3);
	
		//show integer value result
		System.out.println(out);
		
		// present appropriate message for type of triangle
		switch (out)
		{
			case 0:
				System.out.println("the sides do not form a triangle");
			case 1:
				System.out.println("the sides form an acute triangle");
			case 2:
				System.out.println("the sides form a right triangle");
			default:
				System.out.println("the sides form an obtuse triangle");
		}
	}
}
