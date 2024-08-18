import java.util.Scanner;
import java.util.Random;
/* Alex Balli
October 7, 2011
Assignment 3, Problem 4
This program has the user guess a randomly generated number between 1 and 100 until the user gets the number
*/
public class GuessMyNumber {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Random rng = new Random();
		
		// get a random number
		int rnd = rng.nextInt (100) + 1;
		
		// prompt user for number
		System.out.println("guess a number between 1 and 100");
		
		// define variable for user's number
		int guess = input.nextInt();
		
		// make loop for user's guessing
		while(guess!=rnd){
			
			// if too high, tell user that the guess is too high
			if (guess>rnd)
			{	System.out.println("too high. try again");
				guess = input.nextInt();
			}
			
			// if too low, tell user that the guess is too low
			if (guess<rnd)
			{	System.out.println("too low. try again");
				guess = input.nextInt();
			}
			
			// if guess is right, tell user he's right
			if (guess==rnd)
				System.out.println("YAY YOU GOT THE NUMBER");
		}
		
	
		}
		
	}

