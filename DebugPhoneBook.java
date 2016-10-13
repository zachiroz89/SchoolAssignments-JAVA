import javax.swing.*;
public class DebugPhoneBook extends DebugBook
{
   public String area;
   public String size; 
   public final int CUTOFF = 30;
   
  public DebugPhoneBook(int pages, String city)
   {
      super(pages);
      area = city;
      if(pages > CUTOFF)
         size = "big";
      else
         size = "small";
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book."); 
   }
}