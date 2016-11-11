import javax.swing.*;
import java.util.*;
class Alien{
	protected int eyes;
	protected int brains;
	protected int hearts;
	
	public void setFields(){
		
		String eye=JOptionPane.showInputDialog(null, 
		"Enter number of Eyes: ");
		eyes=Integer.parseInt(eye);
		
		String brain=JOptionPane.showInputDialog(null, 
		"Enter number of Brains: ");
		brains=Integer.parseInt(brain);
		
		String heart=JOptionPane.showInputDialog(null, 
		"Enter number of Hearts: ");
		hearts=Integer.parseInt(heart);

		
	
	}
	public void display(){
		String temp= Integer.toString(eyes);
		System.out.println("Eyes:"+eyes);
		temp= Integer.toString(brains);
		System.out.println("Brains:"+brains);
		temp= Integer.toString(hearts);
		System.out.println("Hearts:"+hearts);
		
		
	}
}