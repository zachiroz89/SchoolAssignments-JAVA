import javax.swing.*;
import java.util.*;

class GeometricFigure2 implements SidedObjectInterface {
	
	String figureType,height, width, numberSides;
	int area;
	Scanner input = new Scanner(System.in);
	public GeometricFigure2(){
		
		
		height=JOptionPane.showInputDialog(null,"Input Height: ");
				
		width=JOptionPane.showInputDialog(null,"Input Width: ");

		//numberSides();
		
		
		
	}
        public void display(){
        System.out.println(this.figureType + " Area:"+ area+this.figureType + " Number of sides:"+numberSides);
    }
	public String numberSides(){
		String numberSides=JOptionPane.showInputDialog(null, "Enter number of sides");
		return numberSides;
	}
}