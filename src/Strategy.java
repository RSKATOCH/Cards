
public abstract class Strategy
{
	public abstract String getNextMove(Hand hand);

	public abstract void updateBids(Integer bid);
}