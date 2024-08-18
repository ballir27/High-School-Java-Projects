import java.util.Random;

public class cards {
private String face;
private String suit;

public cards( String cardFace, String cardSuit){
	face = cardFace;
	suit = cardSuit;
}
public String toString(){
	return face + " of " + suit;
}
}