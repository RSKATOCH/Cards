import entities.Card;

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

	public Card getBid() {
		return hand.dropCard(new Card(String.valueOf(strategy.getNextMove() - 1), hand.cards.get(0).suit));
	}

	public Integer getPoints() {
		return score;
	}

	public void updatePoints(Integer score) {
		this.score += score;
	}

	public void updateBids(Integer bid) {
		this.strategy.updateBids(bid);
	}
}
