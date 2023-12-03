public class Customer
{
    String custName="Balya";
    String custAddress="Panvel";

    void changeAddress(String add)
    {
        custAddress=add;
    }
    void display()
    {
        System.out.println("name is "+custName);
        System.out.println("add is "+custAddress);

    }
    
}
