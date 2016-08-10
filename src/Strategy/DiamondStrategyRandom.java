package Strategy;
import entities.Card;
import entities.Hand;

public class DiamondStrategyRandom extends Strategy {

	@Override
	public String getNextMove(Hand hand, Card bidOn) {
		// TODO Auto-generated method stub
		int RandomIndex = (int) (Math.random()*hand.cards.size());
		return hand.dropCard(hand.cards.get(RandomIndex)).face;
	}



}
