public class OperationsDemo 
{ 
    int result=0;
    int sum;
    float div;
    int  sum()
    {
        int a,b;
        a=10; 
        b=20;
        result=a+b;
        return result;
    }
    int div()
     {
        int a,b;
        a=100;
        b=10;
        result=a/b;
        return result;
     }
    public static void main(String[] args)
    {
        OperationsDemo op=new OperationsDemo();
        System.err.println("sum is "+op.sum());
        System.out.println("div is "+op.div());
    }
    
}
