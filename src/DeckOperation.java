import java.util.ArrayList;
import java.util.Collections;

public class DeckOperation {

	private String suits[] = {"clubs","diamonds","hearts","spades"};
	private String rank[] = {"ace","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
	boolean isShuffled = false;
	
	/**
	 * @description Constructor, method to create a game, it is combing all the ranks and all the suits.
	 * 
	 */
	public ArrayList<Card> createGame(){
		ArrayList<Card> deck = new ArrayList<Card>();
		
		for(int i=0; i<suits.length; i++){
			System.out.println("Suits Counter:" +i);
			for(int j=0; j<rank.length; j++){
				Card card = new Card(suits[i], rank[j]);
				deck.add(card);
			}
			
		}
		System.out.println("Game Created!");
		isShuffled = false;
		return deck;
	}
	
	/**
	 * @description Method to shuffle the ArrayList
	 * @param deck
	 */
	public void shuffleArray(ArrayList<Card> deck){
		  Collections.shuffle(deck);
		  isShuffled = true;
		  System.out.println("Cards Shuffled!");
	}
	  
	/**
	 * @return if the deck is shuffled or not
	 */
	public boolean isShuffled(){
		return isShuffled;
	}
	  
	/**
	 * @description Returns the first card of the list and remove it from the list.
	 * @param deck
	 * @return card
	 */
	public Card returnCard(ArrayList<Card> deck){
		if(deck.size() == 0){
			System.out.println("No more Cards");
			return null;
		}else{
			return deck.remove(0);
		}
		
	}
	  
	/**
	 * @description Main method for test.
	 * @param args
	 */
	public static void main(String args[]){
	  
		//Creating a new object of DeckOperation
		DeckOperation deckOperation = new DeckOperation();
		
		//Creating a new ArrayList to store the deck,
		ArrayList<Card> deck = new ArrayList<Card>();
	 
		//Creating the game
		deck = deckOperation.createGame();
	 
		
		//Validations.
		if(deckOperation.isShuffled()){
			System.out.println("is Shuffled!");
			deckOperation.returnCard(deck).toString();
		}else{
			System.out.println("is NOT Shuffled!");
			deckOperation.shuffleArray(deck);
			
			while(deck.size() != 0){
				Card cardReturned = new Card();
				cardReturned = deckOperation.returnCard(deck);
				System.out.println(cardReturned.toString());
				System.out.println(deck.size());
			}
			
			//Uncomment the code below and run it to check the size validation on returnCard method.
			
			/* 
			Card cardReturned2 = new Card();
			cardReturned2 = deckOperation.returnCard(deck);	 
			System.out.println(cardReturned2.toString());
			System.out.println(deck.size()); */
			
	 }
  }
}
