
public class Project 
{
	public static void main(String args[]) 
	{
		System.out.println("in project class...");
		System.out.println("prop1 = " + System.getProperty("prop1"));
		System.out.println("prop2 = " + System.getProperty("prop2"));
		System.out.println("prop3 = " + System.getProperty("prop3"));
		System.out.println("args = " + args[0]);
		System.out.println("user home = " + System.getProperty("user.home"));
	}
}