import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Card;

public class SimpleStrategy extends Strategy
{

	public SimpleStrategy() {
		
	}
	
	@Override
	public String getNextMove(Hand hand) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String output = sc.next();
		Card card = new Card(output,hand.cards.get(0).suit);
		while(!hand.cards.contains(card)) {
			System.out.println("Card not in hand, enter again");
			output = sc.next();
			card = new Card(output,hand.cards.get(0).suit);
		}
		hand.dropCard(card);
		return output;
	}

	@Override
	public void updateBids(Integer bid) {
		// Do nothing
		return;
	}
	
}