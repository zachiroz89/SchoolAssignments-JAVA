class Poker extends CardGame {
	public Poker() {
		super();
		displayDescription();
		deal();
	
		
	}
	public void displayDescription(){
		System.out.println("In casual play, the right to deal a hand typically rotates among the players and is marked by a token called a dealer button (or buck). In a casino, a house dealer handles the cards for each hand, but the button (typically a white plastic disk) is rotated clockwise among the players to indicate a nominal dealer to determine the order of betting. The cards are dealt clockwise around the poker table, one at a time.One or more players are usually required to make forced bets, usually either an ante or a blind bet (sometimes both). The dealer shuffles the cards, the player on the chair to his right cuts, and the dealer deals the appropriate number of cards to the players one at a time, beginning with the player to his left. Cards may be dealt either face-up or face-down, depending on the variant of poker being played. After the initial deal, the first of what may be several betting rounds begins. Between rounds, the players' hands develop in some way, often by being dealt additional cards or replacing cards previously dealt. At the end of each round, all bets are gathered into the central pot.At any time during a betting round, if one player bets, no opponents choose to call (match) the bet, and all opponents instead fold, the hand ends immediately, the bettor is awarded the pot, no cards are required to be shown, and the next hand begins. This is what makes bluffing possible. Bluffing is a primary feature of poker, one that distinguishes it from other vying games and from other games that make use of poker hand rankings.At the end of the last betting round, if more than one player remains, there is a showdown, in which the players reveal their previously hidden cards and evaluate their hands. The player with the best hand according to the poker variant being played wins the pot. A poker hand comprises five cards; in variants where a player has more than five cards available to them, only the best five-card combination counts.");
		
	}
	
	public void deal(){
		for(int y=0; y<5; ++y){
		super.display(y);
		}
	}
}