public class DebugCustomer
{
    public int idNumber;
    public String name;
    public double creditLimit;
    public DebugCustomer(int id, double credit, String name)
    {
       idNumber = id;
       this.name = name;
       creditLimit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
