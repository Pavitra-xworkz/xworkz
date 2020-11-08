public class TheaterFinder{
	
	public static void main(String[] names){
		System.out.println("Invoked main");
		
		BestTheaterInHubli(Theater.APSARA);
		System.out.println("EXIT :: main");
	}
	
	public static void BestTheaterInHubli( Theater theaterName)
	{
		System.out.println("Invoked BestTheaterInHubli");
		switch(theaterName){
			case APSARA:
				System.out.println("case is "+theaterName);
				System.out.println("Viewers rating of the "+theaterName+ " theater is 5");
				break;
			
			case PVR:
				System.out.println("case is "+theaterName);
				System.out.println("Viewers rating of the "+theaterName+ " theater is 4");
				break;
				
			case CINEPOLIS:
				System.out.println("case is "+theaterName);
				System.out.println("Viewers rating of the "+theaterName+ " theater is 4");
				break;
				
			case SUDHA:
				System.out.println("case is "+theaterName);
				System.out.println("Viewers rating of the "+theaterName+ " theater is 3");
				break;
				
			case SUJATA:
				System.out.println("case is "+theaterName);
				System.out.println("Viewers rating of the "+theaterName+ " theater is 3");
				break;
				
		}
		
		System.out.println("EXIT :: BestTheaterInHubli");
		
	}
}
