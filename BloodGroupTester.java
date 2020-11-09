public class BloodGroupTester{
    
	public static void main(String[] BloodGroupsname){
		
		String bloodgroupO="O";
		BloodGroup convertedOFromString=BloodGroup.valueOf(bloodgroupO);
	
	System.out.println(convertedOFromString);
	
	
	BloodGroup[] allBloodGroup=BloodGroup.values();
	System.out.println(allBloodGroup.length);
	for(int BloodGroupInitial=0;BloodGroupInitial<allBloodGroup.length;BloodGroupInitial++){
		System.out.println("index " + BloodGroupInitial);
		BloodGroup bloodgroupValue=allBloodGroup[BloodGroupInitial];
		System.out.println("bloodgroup enum Value " + bloodgroupValue);
		
	}

	}

}