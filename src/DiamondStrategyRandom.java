import entities.Card;

public class DiamondStrategyRandom extends Strategy {

	@Override
	public String getNextMove(Hand hand, Card bidOn) {
		// TODO Auto-generated method stub
		int RandomIndex = (int) (Math.random()*hand.cards.size());
		return hand.dropCard(hand.cards.get(RandomIndex)).face;
	}

	@Override
	public void updateBids(Integer bid) {
		// TODO Auto-generated method stub
		
	}

}
