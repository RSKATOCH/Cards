package entities;
import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	public List<Card> cards;

	public Hand() {
		cards = null;
	}

	public Hand(List<Card> cards) {
		this.cards = cards;
	}

	public Hand(int size) {
		cards = new ArrayList<>(size);
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public Card dropCard(Card card) {
		cards.remove(card);
		return card;
	}

}
