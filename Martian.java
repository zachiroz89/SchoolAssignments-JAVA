import javax.swing.*;
import java.util.*;
public class Martian extends Alien{
	public Martian() {
		super();
		JOptionPane.showMessageDialog(null, 
		"Enter the following fields for Martian");
		setFields();
		this.display();
		
		
	}
}