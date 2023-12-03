import java.util.Scanner;

public class SwitchDemo
 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your greetings");
        String type = sc.nextLine();
        System.out.println("enter time AM, NOON, PM");
        String time = sc.nextLine();
        switch (type)
        {
            case "Good morning":
                                System.out.println("Good morning ");
                                switch (time)
                                 {
                                    case "AM":
                                    System.out.println("AM is valid time");
                                    break;
                                
                                    default:
                                            System.out.println("Not valid time");
                                        break;
                                }
                                break;
            case "Good afternoon":
                                  System.out.println("Good afternoon ");
                                  switch (time)
                                   {
                                    case "NOON":
                                    System.out.println("NOON is valid ");
                                    break;
                                  
                                    default:
                                    System.out.println("Not valid time");
                                        break;
                                }
                                  break;
            case "Good night": 
                                System.out.println("Good night ");
                                switch (time)
                                 {
                                    case "PM":
                                        System.out.println("PM is valid");
                                        break;
                                
                                    default:
                                    System.out.println("NOT a valid");
                                    break;
                                }
                                break;
            default: 
                    System.out.println("The input does not match");
        }

        
    }
    
}
