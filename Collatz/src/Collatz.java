import java.util.Scanner;
public class Collatz {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		while (in>0){
		int i = 0;
		int start = 1;
		int count = 0;
		int num = input.nextInt();
		int orig = num;
			while (num > 1){
				if (num%2 == 1){
					num = (3* num) + 1;
					count = 0;
				}
				if (num%2 == 0){
					num = num/2;
					count = count+1;	
				}
			}
			while (i< count){
				start = start *2;
				i++;
			}
			System.out.println("CC(" + orig + ")="+ start);
			in--;
		}
		}
		
}
