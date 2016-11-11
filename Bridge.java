class Bridge extends CardGame{
	public Bridge() {
		super();
		displayDescription();
		deal();
	}
	
	public void displayDescription(){
			System.out.println("The game consists of several deals, each progressing through four phases. The cards are dealt to the players, and then the players auction or bid to take the contract specifying how many tricks their partnership receiving the contract needs to take to receive points for the deal. It is during the auction where partners communicate information about their hand, including its overall strength and the length of its suits, although similar conventions for use during play exist. The cards are then played, the declaring side trying to fulfill the contract, and the defenders trying to stop the declaring side from its goal. The deal is scored based on the number of tricks taken, the contract, and various other factors based on the variation played.");
	}
	public void deal(){
		for(int y=0; y<13; ++y){
		super.display(y);
		}
	}
	
}