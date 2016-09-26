//Application Created by Zach Iroz 9/26/16

/*Application for accepting Strings from user, 
and depending on input will display in 
alphabetical order with no regard to case*/

import javax.swing.*;
import java.util.*;

class Alphabetize{
	
	public static void main(String[] args) {
		
		//Declare Variables
		String input1, input2, input3;
		
		//Get inputs
		input1 = JOptionPane.showInputDialog(null,"Enter 3 Different Names\nEnter First Name Now");
		input2 = JOptionPane.showInputDialog(null,"Enter 3 Different Names\nEnter Secong Name Now");
		input3 = JOptionPane.showInputDialog(null,"Enter 3 Different Names\nEnter Third Name Now");
		
		//Determine Alphabetical Order and Display
		JOptionPane.showMessageDialog(null, "Names in Alphabetical Order");
		if (input1.compareToIgnoreCase(input2)<0 && input1.compareToIgnoreCase(input3)<0){
			
			if(input2.compareToIgnoreCase(input3)<0)
			{
				JOptionPane.showMessageDialog(null, input1 + "\n"+ input2+"\n"+input3);
			}
			else{
				JOptionPane.showMessageDialog(null, input1 + "\n"+ input3+"\n"+input2);
			}
		}
		else if (input2.compareToIgnoreCase(input1)<0 && input2.compareToIgnoreCase(input3)<0){
			
			if(input1.compareToIgnoreCase(input3)<0)
			{
				JOptionPane.showMessageDialog(null, input2 + "\n"+ input1+"\n"+input3);
			}
			else{
				JOptionPane.showMessageDialog(null, input2 + "\n"+ input3+"\n"+input1);
			}
		}		
		else if(input3.compareToIgnoreCase(input1)<0 && input3.compareToIgnoreCase(input2)<0){
			
			if(input1.compareToIgnoreCase(input2)<0)
			{
				JOptionPane.showMessageDialog(null, input3 + "\n"+ input1+"\n"+input2);
			}
			else{
				JOptionPane.showMessageDialog(null, input3 + "\n"+ input2+"\n"+input1);
			}
		}
	}
}