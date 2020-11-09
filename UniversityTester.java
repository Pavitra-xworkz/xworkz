public class UniversityTester{
    
	public static void main(String[] Uname){
		
		String universityVTU="VTU";
		University convertedVTUFromString=University.valueOf(universityVTU);
	
	System.out.println(convertedVTUFromString);
	
	
	University[] allUniversity=University.values();
	System.out.println(allUniversity.length);
	for(int UniversityInitial=0;UniversityInitial<allUniversity.length;UniversityInitial++){
		System.out.println("index " + UniversityInitial);
		University universityValue=allUniversity[UniversityInitial];
		System.out.println("university enum Value " + universityValue);
		
	}

	}

}