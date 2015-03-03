package pokerEngine;


public enum eSuit {
	// added values to test with
	HEARTS(0),
	SPADES(1),
	CLUBS(2),
	DIAMONDS(3);


	//all new shit with values for testing
	private int suitValue;

	private eSuit (int value)
	{
		this.suitValue = value;
	}

	public int getSuitValue() {
		return suitValue;
	}

	public int valueOf(card c) {

		return this.suitValue;
	}

	


}