import java.util.*;
import javax.swing.*;

class IceCreamCone2 {
	String flavor;
	int scoops;
	public IceCreamCone2() {
		
		
		setScoops();
		setFlavor();
		
		
	}
	public void setFlavor(){
		try{
			if (scoops>2){
				throw (new IceCreamConeException("Too Many Scoops! You would have a leaning tower of 															IceCream!"));
			}
		}

		catch (IceCreamConeException e){
			scoops = Integer.parseInt(JOptionPane.showInputDialog(null,"Too Many Scoops! You would have a leaning tower of  IceCream!\nEnter Scoops: "));
			
			}
		try{
			flavor=JOptionPane.showInputDialog(null, "We have:\nChocolate\nVanilla\nCoffee\nRocky Road\nEnter Flavor: ");
			if((flavor.compareToIgnoreCase("Chocolate")!=0)|| (flavor.compareToIgnoreCase("Vanilla")!=0)|| (flavor.compareToIgnoreCase("Coffee")!=0)||(flavor.compareToIgnoreCase("Rocky Road")!=0)){
						
				throw (new IceCreamConeException("We only have the 4 flavors!"));
		
				
			}
			
		}
		catch (IceCreamConeException x){
		flavor = JOptionPane.showInputDialog(null, "That's not 1 of 4 flavors\nWe have:\nChocolate\nVanilla\nCoffee\nRocky Road\nEnter a new flavor");
		}
	}
	public void setScoops(){
		
		scoops = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Scoops: "));
		
	}
	public String getFlavor(){
		return flavor;
	}
	public int getScoops(){
		return scoops;
	}
}