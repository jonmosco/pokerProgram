package pokerEngine;

import java.util.ArrayList;
import java.util.Collections;

public class deck {

	private ArrayList<card> DeckCards = new ArrayList<card>();

	public deck() {
		for (int i = 0; i < 4; i++) {
			eSuit Suit = eSuit.values()[i];
			for (int j = 0; j < 13; j++) {
				eCardValue value = eCardValue.values()[j];	
				card c = new card(Suit, value);
				DeckCards.add(c);

			}
		}

		Collections.shuffle(DeckCards);
	}

	public card draw() {
		card c = DeckCards.get(0);
		DeckCards.remove(c);
		return c;
	}
}
