import javax.swing.*;
class RaceHorse extends Horse {
	int races;
	public RaceHorse(String name, String color, int birthYear, int rcs){
		super(name, color, birthYear);
			races=rcs;
	}
	public int getRaces(){
		return races;
	}
}