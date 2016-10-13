public class DebugCustomerMakingPurchase extends DebugCustomer
{
    public double amountOfPurchase;
    public boolean overLimit;
    public DebugCustomerMakingPurchase(int id, double credit, String name, double purchAmount)
    {
      super(id, credit, name);
       amountOfPurchase = purchAmount;
       if(amountOfPurchase > creditLimit)
          overLimit = true;
       else
          overLimit = false;
    }
    public void display()
    {
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
