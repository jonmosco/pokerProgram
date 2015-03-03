package pokerEngine;

/* Current print order when running program is: 
 * 
 *	 print card c eCardValue,  c eCardValue ordinal, c eSuit, c ordinal suit value
 *	 
 *	 print True/False when hand is ran through testFlush method
 *	 print True/False when hand is ran through isStraight method
 *	 print sorted array after return from isStraight
 */
public class play {

	public static void main(String[] args) {


		deck d = new deck();

		hand h = new hand();

		for (int i = 0; i<5; i++)
		{
			card c = d.draw();
			h.AddCardToHand(c);
		}

		for (int i = 0; i< 5; i++)
		{
			card c = h.ReturnCard(i);
			System.out.println(c.getCardValue() + " " + c.getCardValue().ordinal() +
					" of " + c.getSuitValue() + " " + c.getSuitValue().ordinal());
		}

		// seeded hand and cards for testing
		hand testHand = new hand();

		card testCard = new card(eSuit.SPADES, eCardValue.ACE);
		testHand.AddCardToHand(testCard);
		card testCard1 = new card(eSuit.SPADES, eCardValue.KING);
		testHand.AddCardToHand(testCard1);
		card testCard2 = new card(eSuit.SPADES, eCardValue.KING);
		testHand.AddCardToHand(testCard2);
		card testCard3 = new card(eSuit.SPADES, eCardValue.KING);
		testHand.AddCardToHand(testCard3);
		card testCard4 = new card(eSuit.SPADES, eCardValue.TEN);
		testHand.AddCardToHand(testCard4);	
		
		// End of test cards, printing statements to ensure everything works.
		System.out.println();
		System.out.println("isFlush equals " + h.isFlush(testHand) + "\n");

		System.out.println("isStraight equals " + h.isStraight(testHand) + "\n");
		
		System.out.println("straightFlush equals " + h.straightFlush(testHand) + "\n");

		System.out.println("royalFlush equals " + h.royalFlush(testHand) + "\n");

		System.out.println("Sorting hand .... Success!");
		for (card c : testHand.HandCards) {
			System.out.println(c.getCardValue() + " " + c.getCardValue().ordinal() +
					" of " + c.getSuitValue() + " " + c.getSuitValue().ordinal());
		}

		System.out.println("\n" + h.sortHandByValue(testHand).getCardValue());
		System.out.println(h.checkForKind(testHand));
		
		
	

	}
}		


// MISC BULLSHIT GOES HERE

//&& num1.getCardValue().ordinal() > eCardValue.THREE.ordinal()
// new code for testing

// creates new royal flush object to call checkFlush method



//prints value of associated enum
//System.out.println();
//for (eCardValue num1 : eCardValue.values()) {
//System.out.println(num1 + " is fucking " + num1.getCardValue());}

//for (card num1 : h.HandCards) {
//if (num1.getSuitValue() == eSuit.SPADES && num1.getCardValue().ordinal() > eCardValue.TEN.ordinal()){
//System.out.println(num1.getCardValue() + " of "+ num1.getSuitValue());}






