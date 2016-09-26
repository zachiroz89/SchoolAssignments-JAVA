//Debugged by Zach Iroz 9/26
// Phone number conversion
// User enters 10 digits, for example 8005551212
// Output is nicely formatted as (800) 555-1212
import javax.swing.*; 
public class DebugSeven2
{
   public static void main(String[] args) 
   {
      String inputString;
      String newString;
      final String QUIT = "999";
      inputString = JOptionPane.showInputDialog(null,
         "Enter an area code and phone number" +
         "\nas a series of 10 digits" +
         "\nand I will display it in a nice format" +
         "\nEnter " + QUIT + " to quit");
      while(!inputString.equals(QUIT))
      {
         newString = "(" + inputString.substring(0,3) + ") " +
            inputString.substring(3,6) + "-" +
            inputString.substring(6, 10);
         inputString = JOptionPane.showInputDialog(null,
           "The number is " + newString + 
           "\n\nEnter an area code and phone number" +
           "\nas a series of 10 digits" +
           "\nand I will display it in a nice format" +
           "\nEnter " + QUIT + " to quit");
      
      }
   }
}