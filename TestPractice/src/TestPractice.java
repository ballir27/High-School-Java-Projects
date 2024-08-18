import java.util.Scanner;

public class TestPractice {
	
	public static double perim(double w, double l) {
		return (2 * w + 2 *l);
	}
	
	public static double area (double w, double l){
		return (w*l);
	}
		
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		System.out.println("enter the width and the length");
			double width = input.nextDouble();
			double length = input.nextDouble();
			
		System.out.println("if you want the perimeter, press 1. if you want the area, press 2.");
			int calc = input.nextInt();
			
		if (calc == 1)
			System.out.println (perim(width, length));
		if (calc == 2)
			System.out.println(area(width, length));
		
	}

}
