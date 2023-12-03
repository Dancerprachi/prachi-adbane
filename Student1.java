public class Student1
{
     String name;
     int age;
     int marks;

     void initializeStudent1()
     {
        name="Paddy";
        age=19;
        marks=85;
     }
     void displayStudent1()
     {
        System.out.println("Name of the student is "+name);
        System.out.println("Age of the student is "+age);
        System.out.println("Marks of the student is "+marks);
     }
     public static void main(String[] args)
     {
        Student1 st=new Student1();
        st.initializeStudent1();
        st.displayStudent1();
        System.out.println(st.name);
     }
}
