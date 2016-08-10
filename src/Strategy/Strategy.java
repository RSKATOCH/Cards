package Strategy;
import entities.Card;
import entities.Hand;

public abstract class Strategy
{
	public abstract String getNextMove(Hand hand, Card bidOn);

}