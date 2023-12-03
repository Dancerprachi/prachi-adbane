public class Employee 
{
    int empAge;
    String empName;
    //default constructor
    Employee()
    {
        System.out.println("Invoking default constructor");
        empAge=35;
        empName="Rupali";
    }
   //Parameterise Constructor
    Employee(int age, String name)
    {
        System.out.println("I'm in invoking parametrise constructor ");
        empAge=age;
        empName=name;
    }

    void displayEmployee()
    {
        System.out.println("Age is "+empAge);
        System.out.println("Name is "+empName);

    }
    
}
