import javax.swing.*;

class ThrowIceCream {
	public static void main(String[] args) {
		IceCreamCone[] coneArray = new IceCreamCone[3];
		for (int x=0; x<coneArray.length;++x){
			coneArray[x] = new IceCreamCone();
			JOptionPane.showMessageDialog(null, coneArray[x].getFlavor() + " with "+coneArray[x].getScoops()+ " Scoops!");
		}
		
	}
}