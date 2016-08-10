import entities.Card;

public abstract class Strategy
{
	public abstract String getNextMove(Hand hand, Card bidOn);

	public abstract void updateBids(Integer bid);
}