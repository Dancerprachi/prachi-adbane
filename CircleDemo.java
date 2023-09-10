import java.util.Scanner;

public class CircleDemo
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius value ");
        int radius= sc.nextInt();
        final float pi = 3.14f ;
        float area = pi* radius*radius;
        System.out.println("Area of circle is " +area);
     }
}
