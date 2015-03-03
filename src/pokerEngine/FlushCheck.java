package pokerEngine;

public class FlushCheck {


	public FlushCheck() 
	{

	}



	public boolean testFlush(hand h){

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




}
// recognizes suites of the type specified
//for (card num1 : test.HandCards) {
//	if (num1.getSuitValue() == eSuit.SPADES){
//	System.out.println(num1.getCardValue() + " of "+ num1.getSuitValue());}

// iterates through hand checking each card value, then prints that card only, untested for pairs
/*for (card num1 : test.HandCards) {
	if (num1.getCardValue() == eCardValue.SEVEN){
	System.out.println(num1.getCardValue() + " of "+ num1.getSuitValue());}*/


/*boolean royalFlush = true;
for(int x = 0; x < h.HandCards.size(); x++) {
	System.out.println(h.HandCards.get(x).getSuitValue());
	//if(h.HandCards.getSuitValue() == (num1.getSuitValue()+1)){
		//royalFlush = false;}

}
	return royalFlush;
}*/
