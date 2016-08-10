/*import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
*/

import java.util.List;

import entities.Card;

public class GameHand extends Hand
{
	public GameHand(List<Card> cards) {
		super(cards);
	}

	public GameHand(int size) {
		super(size);
	}
}