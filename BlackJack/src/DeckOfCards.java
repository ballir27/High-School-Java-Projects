import java.util.Random;

public class DeckOfCards {
	private cards[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	private static final Random randomNumbers = new Random();
	
	public DeckOfCards(){
		String[] faces = {"Ace", "Deuce", "Three", "Four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king" };
		String[] suits = { "hearts", "diamonds", "clubs", "spades"};
		deck = new cards[ NUMBER_OF_CARDS];
		currentCard = 0;
		
		for( int count = 0; count <deck.length; count++)
			deck[ count ] = new cards( faces[count%13], suits [count/13]);
	}
	public void shuffle(){
		currentCard=0;
		
		for(int first = 0; first < deck.length; first++){
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			cards temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
			
		}		
	}
	
	public cards dealCard(){
		if (currentCard< deck.length)
			return deck[ currentCard++ ];
		else
			return null;
	}
}
