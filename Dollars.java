//Created by Zach Iroz 6/23/16
//For accounting, takes a dollar amount and converts to highest denomination of bills, the highest being a 20 dollar bill.
import javax.swing.JOptionPane;

public class Dollars {
      public static void main(String[] args)
    {
        //declare variables
        String dollarsString;
        int dollars;
        int twenties;
        int tens;
        int fives;
        int ones;
        
        //get input 
        dollarsString=JOptionPane.showInputDialog(null, "Enter Dollar Amount (Whole Dollars Only):", "Dollars Information", JOptionPane.INFORMATION_MESSAGE);
        dollars= Integer.parseInt(dollarsString);
        
        //Calculate denominations
        twenties=dollars/20;
        dollars-=(twenties*20);
        tens=dollars/10;
        dollars-=(tens*10);
        fives=dollars/5;
        dollars-=(fives*5);
        ones=dollars;
        
        //display denominations  
        JOptionPane.showMessageDialog(null, "20's:"+twenties+"\n 10's:"+tens+"\n 5's:"+fives+"\n 1's:"+ones);
    }
}
