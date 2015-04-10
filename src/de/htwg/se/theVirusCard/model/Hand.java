package de.htwg.se.theVirusCard.model;

import java.util.LinkedList;

public class Hand {
	private LinkedList<Card> hand;
	private int countOfCards;
	private int maxCountOfCards;
	
	public Hand(int size) throws IllegalArgumentException{
		if (size <= 5) throw new IllegalArgumentException("Count of Cards must be 5 or higher");
		hand = new LinkedList<Card>();
		maxCountOfCards = size;
		countOfCards = 0;
	}
	
	public void addCard(Card c) {
		if (countOfCards <= maxCountOfCards){
			hand.add(c);
			countOfCards++;
		}
		else {
			//TODO: Throw Exception: zu viel Karten
		}
	}
	
	public void removeCard(Card c){
		
		hand.remove(c);
		countOfCards--;
	}

}
