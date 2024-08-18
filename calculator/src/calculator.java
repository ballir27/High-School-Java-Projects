import java.util.Scanner;
public class cacurator {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		String word1 = input.next();
		String operator = input.next();
		String word2 = input.next ();
		int one;
		int two;
		int result;
		
		if (word1 == "one")
			one = 1;
		else if (word1 == "two")
			one = 2;
		else if (word1 == "three")
			one = 3;
		else if (word1 == "four")
			one = 4;
		else if (word1 == "five")
			one = 5;
		else if (word1 == "six")
			one = 6;
		else if (word1 == "seven")
			one = 7;
		else if (word1 == "eight")
			one = 8;
		else if (word1 == "nine")
			one = 9;
		else if (word1 == "zero")
			one = 0;
		else
			result = -1;
		
		/////////////////////
		
		if (word2 == "one")
			two = 1;
		else if (word2 == "two")
			two = 2;
		else if (word2 == "three")
			two = 3;
		else if (word2 == "four")
			two = 4;
		else if (word2 == "five")
			two = 5;
		else if (word2 == "six")
			two = 6;
		else if (word2 == "seven")
			two = 7;
		else if (word2 == "eight")
			two = 8;
		else if (word2 == "nine")
			two = 9;
		else if (word2 == "zero")
			two = 0;
		else
			result = -1;
		
		if (operator == "plus")
			result = one + two;
		if(operator == "minus")
			result = one - two;
		if(operator == "times")
			result = one * two;
		if(operator == "div")
			result = one/two;
		
		System.out.print(result);
		
	}
		
		
}
