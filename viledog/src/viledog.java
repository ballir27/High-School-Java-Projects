import java.util.Scanner;
public class viledog {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int a=0;
	int number=input.nextInt();
	
	while(a<=number){
		int i=0;
		int n=0;
		String word1 = input.nextLine();
		String newword = "";
		int length = word1.length();
	while(i<length){
		if(Character.isDigit(word1.charAt(i))== true || Character.isLetter(word1.charAt(i))==true){
			newword = newword + word1.charAt(i);
			i++;
		}
		else
			i++;
	}
	int length2 = newword.length();
	while(n<length2){
		if(Character.toLowerCase(newword.charAt(n))==Character.toLowerCase(newword.charAt((length2-n)-1))){
			if (n==length2-1)
				System.out.println("Case " + a + ": palindrome");
			n++;
		}
		else{
			System.out.println("Case " + a + ": not a palindrome");
			n = length + 1;
		}
	}
	a++;
	}
	}
	
	}
