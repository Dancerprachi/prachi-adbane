public class CustomerDetail
{
    public static void main(String[] args)
    {
        Customer cust=new Customer();
        System.out.println("before Address change");
        cust.display();
        System.out.println("after change Address");
        cust.changeAddress("Chhatrapati Sambhaji Nagar");
        cust.display();
        
    }
    
}
