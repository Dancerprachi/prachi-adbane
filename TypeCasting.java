public class TypeCasting
 {
    public static void main(String[] args) 
    {
       //implicit type casting -lower to higher//

        int a,b;
        a=10;
        b=20;
        float a1,b1,div;
        a1=a;
        b1=b;
        div=a1/b1;
        System.out.println("div "+div);
        
        // explicit type casting higher to lower//
        
        float c=10.25f;
        int add=(int) c+5;
        System.err.println("add is "+add4);

    }
    
}
