import java.util.*;
import javax.swing.*;

class IceCreamCone {
	String flavor;
	int scoops;
	public IceCreamCone() {
		
		
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
			flavor=JOptionPane.showInputDialog(null, "Enter Flavor: ");
		
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