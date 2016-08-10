import entities.Deck;
import pack.PackWithoutJoker;

class DiamondGame {
	
	private static final int NO_DECKS = 1;
	private static final Class JOKERPACK = PackWithoutJoker.class;
	private static final String COMPUTER_SUIT = "SPADE";
	private static final String PLAYER_SUIT = "HEART";
	private static final String DISCARD_SUIT = "CLUB";
	
	Deck gamedeck;
	
	public DiamondGame() throws Exception {
		this.gamedeck = new Deck(NO_DECKS,JOKERPACK);
		GameHand computerHand = new GameHand(Deck.removeSuit(COMPUTER_SUIT));
		GameHand playerHand = new GameHand(Deck.removeSuit(PLAYER_SUIT));
		//	Discard one suit
		Deck.removeSuit(DISCARD_SUIT);
	}
	
	/*
	 * 	Tester main
	 */
	
	public void nextMove() {
		
	}
	
	public static void main(String[] args) {
		
	}
	
}