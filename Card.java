class Card {
	String suit, rank;
	int value;
	int LOW = 1;
	int HIGH= 13;
	 
	public String getSuit(){
			return suit;
	}
	public int getValue(){
		return value;
	}
	public void setRank(){
		String[] rankArray = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		rank = rankArray[value-1];
	}
	public String getRank(){
		return rank;
		
	}
	public void setSuit(int sentSuit){
		switch (sentSuit){
			case 1:
				suit= " of Hearts";
				break;
			case 2:
				suit= " of Diamonds";
				break;
			case 3:
				suit= " of Clubs";
				break;
			case 4:
				suit= " of Spades";
				break;
		}
	}
	public void setValue(int sentValue){
		value = sentValue;
	}
}