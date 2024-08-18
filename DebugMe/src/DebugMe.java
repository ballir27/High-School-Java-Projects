import java.util.Random;

public class DebugMe {

	public static int minimum(int a[]){
		int min = a[0];
		for (int i = 0; i < a.length-1; i++){

			if (min > a[i+1])
				min = a[i+1];
		}
			return min;
	}
	public static void main(String[] args){

			
		Random rgen = new Random();
		
		int total = 0;
		
		final int ARRAY_LENGTH = 12;
		
		int [] x = new int[ARRAY_LENGTH];
		
		for (int i = 0; i < ARRAY_LENGTH; i++){
			x[i] = rgen.nextInt(100);
		}
		
		for (int j = 0; j < ARRAY_LENGTH; j++){
			total = total + x[j];
		}
		
		int average = total/ARRAY_LENGTH;
		
		System.out.printf("%s%8s\n", "Index", "Value");
		for (int counter = 0; counter <ARRAY_LENGTH; counter++){
			System.out.printf("%5d%8d\n", counter, x[counter]);
		}
		
		System.out.printf("Average is %d\n", average);
		System.out.println(minimum(x));
	}
}
