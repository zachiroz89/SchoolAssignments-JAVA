abstract class CardGame extends Card {
	final int CARDDECK = 52;
	final int HIGHVALUE = 13;
	final int LOWVALUE = 1;
	final int HIGHSUIT = 4;
	int x = 0;
	int value;
	int suit;
	

	Card[] card = new Card[CARDDECK];
	int cardsDealt;
	public CardGame() {
		for (suit = LOWVALUE; suit<=HIGHSUIT; ++suit){
			for (value=LOWVALUE; value<=HIGHVALUE;++value){
				card[x] = new Card();
				card[x].setValue(value);
				card[x].setSuit(suit);
				card[x].setRank();
				//System.out.println(card[x].getRank()+ card[x].getSuit());
				++x;
			}	
		}
		shuffle();
		shuffle();
	}
	public void shuffle(){
		
		
		Card tempCard = new Card();
		
		for(int a= 0; a <52; ++a){
			
			int b = (int)(Math.random()*52);
			tempCard = card[a];
			card[a] = card[b];
			card[b] = tempCard;
			//System.out.println(card[a].getRank()+ card[a].getSuit());
		}
		
	}
	public void display(int z){
		System.out.println(card[z].getRank()+ card[z].getSuit());
	}
}