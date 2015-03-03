package pokerEngine;

public class card {

	private eSuit SuitValue;
	private eCardValue CardValue;

	public card(eSuit SuitValue, eCardValue CardValue)
	{
		this.SuitValue = SuitValue;
		this.CardValue = CardValue;
	}

	public eCardValue getCardValue()
	{
		return this.CardValue;
	}

	public eSuit getSuitValue()
	{
		return this.SuitValue;
	}


	
	
	
	
	
	
	// unfinshed && untested
	/*public card getAdjacentCard(hand h) {
		//Iterator<card> nextCard = h.go;
		card newCard = h.go.next();
		h.go.remove();
		//while(nextCard.hasNext()) {
			 
		
		
		return newCard;
	}	
	
//untested
	public int compareTo(card other) {
		return this.CardValue.compareTo(other.CardValue);
	}
//untested
	public boolean isSame(card value){
		if(this.getCardValue() == value.getCardValue()){
			return true;
		} else {
			return false;
		}
	}*/
}
