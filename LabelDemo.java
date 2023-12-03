public class LabelDemo 
{
    public static void main(String[] args)
     {
        int i,j;
        Outer:
                for(i=1;i<=10;i++)
                {
                    System.out.println("Hello Dancers "+i);
                    for(j=1;j<=10;j++)
                    {
                         if(j>i)
                         break Outer;
                         System.out.println("I am your Choreographer "+j);
                    }
                } 
                System.out.println("I am in the dancing hall");       
    }
    
}
