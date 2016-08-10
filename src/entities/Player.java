package entities;
import Strategy.Strategy;

public class Player {
	Hand hand;
	Integer score = 0;
	String name;
	Strategy strategy;

	public Player(Hand hand, Strategy strategy, String name) {
		this.hand = hand;
		this.name = name;
		this.strategy = strategy;
	}

	public Card getBid(Card bidOn) {
		String suit= hand.cards.get(0).suit;
		Card card = new Card(strategy.getNextMove(hand, bidOn), suit);
		return hand.dropCard(card);
	}

	public Integer getPoints() {
		return score;
	}

	public void updatePoints(Integer score) {
		this.score += score;
	}


}
