import javax.swing.*;
import javax.management.*;

public class BadSubscriptCaught
{
	public static void main(String[] args) 
	{
		String[] firstNameArray = {"huey", "duey", "louis", "donald",
				 "daffy", "mc", "malard", "DW", "ducky", "launchpad"};
		String lname = " duck";
		
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter subscript between 0 and 9"));
		
		try{
			System.out.println(firstNameArray[x] + lname);
		}
		catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Out of Bounds");
		}
	}
}