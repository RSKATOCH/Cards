import java.util.Scanner;

import entities.Card;

public class SimpleStrategy extends Strategy
{

	public SimpleStrategy() {
		
	}
	
	@Override
	public String getNextMove(Hand hand, Card bidOn) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String output = sc.next();
		Card card = new Card(output,hand.cards.get(0).suit);
		while(!hand.cards.contains(card)) {
			
			output = sc.next();
			card = new Card(output,hand.cards.get(0).suit);
		}
		hand.dropCard(card);
		for(Card c : hand.cards) {
			System.out.print(c.getFaceValue()+" ");
		}
		return output;
	}

	@Override
	public void updateBids(Integer bid) {
		// Do nothing
		return;
	}
	
}