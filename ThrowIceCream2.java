import javax.swing.*;

class ThrowIceCream2 {
	public static void main(String[] args) {
		IceCreamCone2[] coneArray2 = new IceCreamCone2[3];
		for (int x=0; x<coneArray2.length;++x){
			coneArray2[x] = new IceCreamCone2();
			JOptionPane.showMessageDialog(null, coneArray2[x].getFlavor() + " with "+coneArray2[x].getScoops()+ " Scoops!");
		}
		
	}
}