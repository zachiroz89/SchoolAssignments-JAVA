import javax.swing.*;
import java.util.*;
public class Jupiterian extends Alien {
	public Jupiterian() {
		super();
		JOptionPane.showMessageDialog(null, 
		"Enter the following fields for Jupiterian");
		setFields();
		System.out.println("Jupiterian");
		this.display();
		
	}
}