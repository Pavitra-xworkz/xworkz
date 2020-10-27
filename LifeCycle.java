public class LifeCycle
{
	
	public static String agetype(int age)
	{
		System.out.println("Jvm invoked age");
		System.out.println("age :"+age);
		
		if(age>=1 &&age<=6)
		{
			System.out.println("the return value is:" +age);
			return "kids";
		}
		
		if(age>=6 && age<=13)
		{
			System.out.println("the return value is:" +age);
			return "child";
		}
		
		if(age>=14 && age<=19)
		{
			System.out.println("the return value is:" +age);
			return "teen";
		}
		if(age>=20 && age<=50)
		{
			System.out.println("the return value is:" +age);
			return "adult";
		}
		
		
		if(age>=50 && age<=100)
		{
			System.out.println("the return value is:" +age);
			return "old";
		}
	return "Immortal";
	}
}
	
