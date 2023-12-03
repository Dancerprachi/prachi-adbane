import java.util.Vector;
class Prachi
{
	public static void main(String args[])
	{
		Vector<String> v=new Vector<>();
		v.add("Pratham");
		v.add("Vijay");
		v.add("Panchal");
		v.add("Aryan");
		v.add("Siddhi");
	
		System.out.print(v);
		v.remove(2);
		System.out.print(v);
	}
}
		