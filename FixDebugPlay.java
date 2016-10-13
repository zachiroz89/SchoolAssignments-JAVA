public class FixDebugPlay
{
   public String tit;
   public String auth;

   public FixDebugPlay(String title, String author)
   {
      tit = title;
      auth = author;
   }
   public void display()
   {
      System.out.println("The performance is " + tit +
        " by " + auth);
   }
}