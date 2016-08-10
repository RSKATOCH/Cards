import entities.Card;

public class MatchingStrategy extends Strategy {

	@Override
	public void updateBids(Integer bid) {
		// Do nothing

	}

	@Override
	public String getNextMove(Hand hand, Card bidOn) {
		return hand.dropCard(bidOn).face;
	}

}
