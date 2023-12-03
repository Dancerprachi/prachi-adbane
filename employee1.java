public class employee1 
{
    
     String empName;
    String empId;
    int empSalary;
    employee1()
    {
        System.out.println("The details of the employee are ");
        empName="Prachi";
        empId="prachi@123";
        empSalary=45000;
    }
    /**
     * 
     */
    void displayemployee1()
    {
        System.out.println("Name of the employee is ");
        System.out.println("Id of the employee is ");
        System.out.println("Salary of the employee is ");
    }
    
    public static void main(String[] args) 
    {
        employee1 emp=new employee1();
        emp.displayemployee1();
        
        
    }
    
    

        
    
    
}
