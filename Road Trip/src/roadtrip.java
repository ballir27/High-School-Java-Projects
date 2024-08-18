import java.util.*;
public class roadtrip {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		double cost;
		double d1;
		double d2;
		int n;
		int i = 0;
	
		n = input.nextInt();
		while(i<n){
			i++;
			cost = input.nextDouble();
			d1 = input.nextDouble();
			d2 = input.nextDouble();
			double gal1 = d1/35;
			double c1 = 2 * gal1 * cost;
			double gal2 = d2/49;
			double c2 = 2 * gal2 * cost;
			double total = c1 + c2;
			double alltheway = 8 * cost;
	
			if(total < alltheway){
				System.out.printf("Case %d: $%.2f \n", i, total);
			}
			else{
				System.out.printf("Case %d: $%.2f \n", i, alltheway);
			}
		}
	}
}
