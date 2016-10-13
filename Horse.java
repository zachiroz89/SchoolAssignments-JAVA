import javax.swing.*;
public class Horse {
	String name, color;
	int birthYear;
	public Horse(String nm, String clr, int by)
	{
		setName(nm);
		setColor(clr);
		setBirthYear(by);
		
	}
	public void setName(String nm){
		name=nm;
	}
	public void setColor(String clr){
	color=clr;
	}
	public void setBirthYear(int by){
		birthYear=by;
	}
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	public int getBirthYear(){
		return birthYear;
	}
}