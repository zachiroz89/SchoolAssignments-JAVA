import javax.swing.*;
import java.util.*;
import java.awt.geom.*;

class GeometricFigure {
	
	String figureType,height, width;
	int area;
	Scanner input = new Scanner(System.in);
	public GeometricFigure(){
		
		
		height=JOptionPane.showInputDialog(null,"Input Height: ");
				
		width=JOptionPane.showInputDialog(null,"Input Width: ");

		getArea(height, width);
		
		
	}
	public void getArea(String height, String width){
		
	}
}