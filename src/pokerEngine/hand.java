package pokerEngine;

import java.util.ArrayList;


public class hand {

	ArrayList<card> HandCards = new ArrayList<card>();
	//Iterator<card> go = HandCards.iterator();

	public hand()
	{

	}

	// Add card to the end of the hand
	public void AddCardToHand(card c)
	{
		HandCards.add(c);

	}

	// Return the position of the card in the hand
	public card ReturnCard(int num1)
	{
		return HandCards.get(num1);
	}

	// Check (count) number of cards in hand 
	public int cardsInHand()
	{
		return HandCards.size();	
	}

	
	// Sorts hand by value associated (crude version of bubble sort implemented)
	public card sortHandByValue(hand h) {
		card highCard;
		
		for (int k = 1; k < h.cardsInHand(); k++) {
			for (int i = 0; i < (h.cardsInHand() - k); i++) {
				if(h.ReturnCard(i).getCardValue().ordinal() > h.ReturnCard((i+1)).getCardValue().ordinal()) {
					card temp = h.HandCards.get(i);
					card temp1 = h.HandCards.get(i+1);
					h.HandCards.remove(i);
					h.HandCards.add(i+1, temp);;
					temp = temp1;
					temp1 = temp;
					
				}
			}
		}
		highCard = h.HandCards.get(4);
		return highCard;

	}

	/* Method tests the suit of each card. grabs the suit value of the card at index zero in hand then 
	   stores it in element1. Iterates through each card testing if the current cards ordinal (enum value) is equal 
	   the value at index zero*/
	public boolean isFlush(hand h){

		eSuit element1 = h.HandCards.get(0).getSuitValue();

		boolean flush = true;

		for (card num1 : h.HandCards){
			if (num1.getSuitValue() != element1) {
				flush = false;
				break;
			}	
		} 
		return flush;			
	}

	// Accepts hand, sorts, then checks each eCardValue.ordianal by testing it against the previous eCardValue.ordinal 
	// 	to see if they line up sequentially
	public boolean isStraight(hand checkMe) {

		boolean checkMate = false;
		sortHandByValue(checkMe);
		eCardValue element1 = checkMe.HandCards.get(0).getCardValue();
		
		for (card num1 : checkMe.HandCards ) {
			if (num1.getCardValue() == element1.nextCardValue()){
				element1 = num1.getCardValue();
				checkMate = true;	
			}
			else checkMate = false;
		}
		return checkMate;
	}

	// Call isStraight and isFlush methods to check for a straightFlush
	public boolean straightFlush(hand h) {

		if (isStraight(h) && isFlush(h)){
			return true;
		}
		else {
			return false;
		}
	}

	// Copied sortByValue, works the same just with SuitValue
	public void sortBySuit(hand h) {

		for (int k = 1; k < h.cardsInHand(); k++) {
			for (int i = 0; i < (h.cardsInHand() - k); i++) {
				if(h.ReturnCard(i).getSuitValue().ordinal() > h.ReturnCard((i+1)).getSuitValue().ordinal()) {
					card temp = h.HandCards.get(i);
					card temp1 = h.HandCards.get(i+1);
					h.HandCards.remove(i);
					h.HandCards.add(i+1, temp);;
					temp = temp1;
					temp1 = temp;

				}
			}
		}
	}

	// Checks for SPADE eSuit and eCardValue higher than NINE
	public boolean royalFlush(hand h) {

		boolean checkMate = false;
		eSuit spade = eSuit.SPADES;
		int royal = eCardValue.NINE.getCardValue();

		if(isStraight(h)) {
			for (card num1 : h.HandCards) {
				System.out.println(royal + "\t" + num1.getCardValue());
				if (num1.getSuitValue().equals(spade) && (num1.getCardValue().returnCardValue(num1) > royal)){
					checkMate = true;
					continue;
				}
				else 
					checkMate = false;
				break;
			}
		}
		return checkMate;	
	}

	// Checks for 3 of a kind and 4 of a kind. 
	// Also checks for a pair, needs further implementation full house and 2 pair.
	public boolean checkForKind(hand h) {
		int count = 0;
		sortHandByValue(h);	

		eCardValue temp1 = h.HandCards.get(0).getCardValue();

		for (card c : h.HandCards) {
			if (c.getCardValue() == temp1) {
				count++;
			}
		}

		// Simple switch statement to check if variable is 2,3, or 4. 
		// Will have to implement later to check for full house and 2 pair.
		switch(count) {
		case 2:
			System.out.println("found a pair " + count);
			return true;
		case 3:
			System.out.println("three of a kind found " + count);
			return true;
		case 4:	
			System.out.println("four of a kind found " + count);
			return true;
		}

		System.out.println("\nCheck for a kind count is " + count);
		return false;
	}










}





//  MISC BULLSHIT GOES HERE






//for(int i = 0; i < checkMe.cardsInHand()-1; i++){
//int temp = checkMe.HandCards.get(i).getCardValue().ordinal();
//int temp2 = checkMe.HandCards.get(i+1).getCardValue().ordinal();
//System.out.println(checkMe.ReturnCard(i).getCardValue().ordinal());
//if(temp < temp2) {
//(checkMe.ReturnCard(i+1).getCardValue().ordinal())-1 );
//if(checkMe.ReturnCard(i).getCardValue() != checkMe.ReturnCard(i+1).getCardValue().getNext()){	
//.getCardValue() + " " + c.getCardValue().ordinal() +
//" of " + c.getSuitValue() + " " + c.getSuitValue().ordinal());

//checkMate = true;


//if			//true							//else
//return this.ordinal() < Planet.values().length - 1 ? Planet.values()[this.ordinal() + 1] : null;


//System.out.println(num1.getCardValue().ordinal());




