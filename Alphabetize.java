//Application Created by Zach Iroz 9/26/16

/*Application for accepting Strings from user, 
and depending on input will display if put in 
alphabetical order with no regard to case*/

import javax.swing.*;
import java.util.*;

class Alphabetize{
	
	public static void main(String[] args) {
		
		//Declare Variables
		String input1, input2, input3;
		
		//Get inputs
		input1 = JOptionPane.showInputDialog(null,"Enter 3 Different Names in Alphabetical Order\n\nEnter First Name Now");
		input2 = JOptionPane.showInputDialog(null,"Enter 3 Different Names in Alphabetical Order\n\nEnter Secong Name Now");
		input3 = JOptionPane.showInputDialog(null,"Enter 3 Different Names in Alphabetical Order\n\nEnter Third Name Now");
		
		//Determine if Alphabetical
		
		if (input1.compareToIgnoreCase(input2)<0){
			
			if (input2.compareToIgnoreCase(input3)<0){
				
				JOptionPane.showMessageDialog(null, "Names are in Alphabetical Order");
			}
			else {
				JOptionPane.showMessageDialog(null, "Names are not in Aphabetical Order");
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "Names are not in Aphabetical Order");
		}
	
	}
}