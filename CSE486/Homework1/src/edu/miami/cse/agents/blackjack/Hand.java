package edu.miami.cse.agents.blackjack;

import java.util.ArrayList;

import edu.miami.cse.agents.blackjack.Card.Rank;

/**
 * A hand (the cards) of a Blackjack player or dealer
 */

public class Hand {
	private ArrayList<Card> cards;

	/**
	 * Creates a new empty card list.
	 */
	public Hand() {
		cards = new ArrayList<Card>();
	}

	/**
	 * Add a card to the card list.
	 */

	public void add(Card card) {
		cards.add(card);
	}

	/**
	 * Calculates and returns the hand value (sum of the hand cards values)
	 * 
	 * @return The hand value
	 */

	public int getValue() {
		int sum = 0;
		int i = 0;
		while (i < cards.size()) {
			if (cards.get(i).getRank().equals(Rank.ACE)) { //If card is an ace
				//Treating each ace like an 11 unless it's over 21, then you can subtract 10 to treat as 1
				sum += 11;
				if (sum > 21)
					sum -= 10;
			}
			if (cards.get(i).getRank().ordinal() > 0 && cards.get(i).getRank().ordinal() < 9) {  //If card is a number
				sum += cards.get(i).getRank().ordinal()+1;  //Add one because enum constants are off by one value
			}
			if (cards.get(i).getRank().equals(Rank.THREE)) { //If card is a face or ten
				sum += 10;
			}
			i++;
		}
		return sum;
	}

	/**
	 * override toString in class java.lang.Object
	 */

	public String toString() {
		StringBuilder out = new StringBuilder();

		for (Card c : cards) {
			out.append(c.toString() + " ");
		}
		return new String(out);
	}

}
