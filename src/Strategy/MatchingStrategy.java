package Strategy;
import entities.Card;
import entities.Hand;

public class MatchingStrategy extends Strategy {



	@Override
	public String getNextMove(Hand hand, Card bidOn) {
		return hand.dropCard(bidOn).face;
	}

}
