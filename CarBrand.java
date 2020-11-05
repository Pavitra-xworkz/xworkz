// write class with method to return an array of car brancd, Then lopp the brands in the main method


public class CarBrand
{
	public static void main(String[] carBrands)
	{
		System.out.println("JVM invoked main");
		
		getcarBrands();
	System.out.println("Exit:: main");	
		
	}
	
	
	
	public static String[] getcarBrands()
	{
		
		
		String[] nameOfCarbrands={"Audi", "Honda", "Kia" , "Toyota"};
		
		System.out.println("size is "+nameOfCarbrands.length);
		
		for(int count=2;count<nameOfgetCarbrands.length;count++)
		{
			System.out.println("count :" +count);
			
			String message=nameOfgetCarbrands[count];
			System.out.println("car "+message);
		  
		}
		
		
		return nameOfCarbrands;
	}
	
	
}