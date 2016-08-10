package Strategy;
import entities.Card;
import entities.Hand;

public class CounterMatchingStrategy extends Strategy {
	static String strategy = "23456789TJQKA";

	@Override
	public String getNextMove(Hand hand, Card bidOn) {
		return strategy.charAt((strategy.indexOf(bidOn.face) + 1) % strategy.length()) + "";
	}

}
