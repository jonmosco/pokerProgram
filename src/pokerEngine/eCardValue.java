package pokerEngine;

public enum eCardValue {
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);

	private int cardValue;

	private eCardValue (int value)
	{
		this.cardValue = value;
	}

	public int getCardValue() {
		return cardValue;
	}

	// same as getCardValue just accepts a Card
	public int returnCardValue(card num1) {

		return cardValue;
	}

	// gets next eCardValue
	public eCardValue nextCardValue() {
		return this.ordinal() < eCardValue.values().length - 1
				? eCardValue.values()[this.ordinal() + 1]: null;
	}




	//untested
	public boolean isSame(eCardValue element1){
		if(this.cardValue == element1.cardValue){
			return true;
		} else {
			return false;
		}
	}
}

//MISC BULLSHIT

/*public int compareTo(card c) 
{	
	return (cardValue - c.getCardValue().cardValue);
}*/



