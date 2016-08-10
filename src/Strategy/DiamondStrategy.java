package Strategy;
import entities.Card;
import entities.Hand;

public class DiamondStrategy extends Strategy
{
	
	public DiamondStrategy() {

	}
	
	@Override
	public String getNextMove(Hand hand, Card bidOn) {
		return hand.dropCard(hand.cards.get(0)).face;
	}

	public void updateBids(Integer bids) {
		
	}
	
}