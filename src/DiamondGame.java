import java.util.List;

import entities.Card;
import entities.Deck;
import pack.PackWithoutJoker;

class DiamondGame {

	private static final int NO_DECKS = 1;
	private static final Class JOKERPACK = PackWithoutJoker.class;
	private static final String COMPUTER_SUIT = "SPADE";
	private static final String PLAYER_SUIT = "HEART";
	private static final String DISCARD_SUIT = "CLUB";

	private List<Integer> bidOnList;

	Deck gamedeck;

	Player computer;
	Player player;

	public DiamondGame() throws Exception {
		initGame();
	}

	private void initGame() throws Exception {
		this.gamedeck = new Deck(NO_DECKS, JOKERPACK);

		DiamondHand computerHand = new DiamondHand(gamedeck.drawSuit(COMPUTER_SUIT));
		DiamondHand playerHand = new DiamondHand(gamedeck.drawSuit(PLAYER_SUIT));

		Strategy computerStrategy = new DiamondStrategy();
		Strategy playerStrategy = new CounterMatchingStrategy();

		computer = new Player(computerHand, computerStrategy, "computer");
		player = new Player(playerHand, playerStrategy, "player");

		// Discard one suit
		gamedeck.drawSuit(DISCARD_SUIT);
	}

	private String playGame() {

		while (!gamedeck.isEmpty()) {
			conductBidding();
		}
		return getWinner(computer, player);
	}

	private void conductBidding() {
		int computerBid, playerBid;
		Card bidOn;
		int score;
		int winningBid;

		bidOn = gamedeck.draw();
		
		System.out.println("Card: "+bidOn.face);
		
		computerBid = computer.getBid(bidOn).getFaceValue();
		playerBid = player.getBid(bidOn).getFaceValue();

		score = bidOn.getFaceValue();

		updateScores(computerBid, playerBid, score);

		computer.updateBids(playerBid);
		player.updateBids(playerBid);

		System.out.println("Bids were: "+computerBid+" "+playerBid);
		
	}

	private void updateScores(Integer computerBid, Integer playerBid, Integer score) {

		if (computerBid == playerBid) {
			score = score / 2;
			computer.updatePoints(score);
			player.updatePoints(score);
		} else if (computerBid > playerBid) {
			computer.updatePoints(score);
		} else {
			player.updatePoints(score);
		}

	}

	private String getWinner(Player computer, Player player) {
		if (computer.getPoints() == player.getPoints()) {
			return "DRAW";
		} else if (computer.getPoints() > player.getPoints()) {
			return "COMPUTER";
		} else {
			return "YOU";
		}
	}

	/*
	 * Tester main
	 */

	public static void main(String[] args) throws Exception {
		DiamondGame game = new DiamondGame();
		System.out.println("RESULT " + game.playGame());
	}

}