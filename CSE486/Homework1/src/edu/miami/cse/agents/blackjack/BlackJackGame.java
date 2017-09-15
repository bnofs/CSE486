package edu.miami.cse.agents.blackjack;


public class BlackJackGame {

	public static void main(String[] args) {
		// Dummy code update it as explained in the homework.
		
		Deck deck = new Deck();
		
		Hand dealerCards = new Hand();
		dealerCards.add(deck.getCard());
		dealerCards.add(deck.getCard());
		
		System.out.println("dealer: " + dealerCards.toString() + dealerCards.getValue());
		
		DealerAgent dealer = new DealerAgent();
		Action dealerAction = dealer.act(dealerCards);
		
		System.out.println(dealerAction);
	}
	
}


