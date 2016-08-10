import java.util.ArrayList;
import java.util.List;

import entities.Card;

public class DiamondStrategy extends Strategy
{
	
	public DiamondStrategy() {

	}
	
	@Override
	public String getNextMove(Hand hand) {
		// TODO Auto-generated method stub
		return hand.dropCard(hand.cards.get(0)).face;
		
	}

	public void updateBids(Integer bids) {
		
	}
	
}