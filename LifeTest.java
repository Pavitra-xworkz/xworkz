public class LifeTest
{
	public static void main(String[] test)
	{
		System.out.println("Invoked by JVM");
		
		String age=LifeCycle.agetype(12);
		
		System.out.println("the agetype is:" +age);
	
	System.out.println("exit: main");
	}
}