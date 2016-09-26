
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import javax.swing.JOptionPane;

public class Dollars {
      public static void main(String[] args)
    {
        String dollarsString;
        int dollars;
        int twenties;
        int tens;
        int fives;
        int ones;
       
        dollarsString=JOptionPane.showInputDialog(null, "Enter Dollar Amount (Whole Dollars Only):", "Dollars Information", JOptionPane.INFORMATION_MESSAGE);
        dollars= Integer.parseInt(dollarsString);
        twenties=dollars/20;
        dollars-=(twenties*20);
        tens=dollars/10;
        dollars-=(tens*10);
        fives=dollars/5;
        dollars-=(fives*5);
        ones=dollars;
        JOptionPane.showMessageDialog(null, "20's:"+twenties+"\n 10's:"+tens+"\n 5's:"+fives+"\n 1's:"+ones);
    }
}
