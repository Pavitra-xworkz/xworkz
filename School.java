class School
{
	public static void main(String[] args)
	{
		System.out.println("Invoked by JVM");
		learning("Priyank");
		learning("Nikhil",100);
		learning(78.49f);
		learning("A");	
	}
	
	public static void learning(String nameOfStudent)
	{
		System.out.println("The student name is :"+nameOfStudent);

	}
	
	public static void learning(String nameOfTeacher, int noOfStudent)
	{
		System.out.println("The teacher name is:" +nameOfTeacher);
		System.out.println("The no of student :"+noOfStudent);
	}
	
	public static void learning(float passpercentage)
	{
		System.out.println("The percentage is :"+passpercentage);
	
	}
	
	public static void learning(char Grade)
	{
		System.out.println("The grade is :"+Grade);
	}
	
	
	
}