package com.xworkz.DTO;
import java.util.Arrays;

public class PlayerDTOTester {
	public static void main(String[] args) {
		PlayerDTO playerDTO1=new PlayerDTO();
		playerDTO1.setName("Sukesh Hegde");
		playerDTO1.setCountry("Karnataka");
		playerDTO1.setSports(new String[] {"Kabbaddi"});
		playerDTO1.setAwards(new String[] {""});
		
		System.out.println(playerDTO1.getName());
		System.out.println(playerDTO1.getCountry());
		System.out.println(Arrays.toString(playerDTO1.getSports()));
		System.out.println(Arrays.toString(playerDTO1.getAwards()));
		System.out.println("************************* ");
		
		PlayerDTO playerDTO2=new PlayerDTO();
		playerDTO2.setName("Prashanth");
		playerDTO2.setCountry("Karnataka");
		playerDTO2.setSports(new String[] {"Kabbaddi"});
		playerDTO2.setAwards(new String[] {"Arjuna"});
		
		System.out.println(playerDTO2.getName());
		System.out.println(playerDTO2.getCountry());
		System.out.println(Arrays.toString(playerDTO2.getSports()));
		System.out.println(Arrays.toString(playerDTO2.getAwards()));
		System.out.println("***************************** ");
		
		PlayerDTO playerDTO3=new PlayerDTO();
		playerDTO3.setName("JeevaKumar");
		playerDTO3.setCountry("Karnataka");
		playerDTO3.setSports(new String[] {"Kabbaddi"});
		playerDTO3.setAwards(new String[] {"Arjuna"});
		
		System.out.println(playerDTO3.getName());
		System.out.println(playerDTO3.getCountry());
		System.out.println(Arrays.toString(playerDTO3.getSports()));
		System.out.println(Arrays.toString(playerDTO3.getAwards()));
		System.out.println("***************************** ");
		
		PlayerDTO playerDTO4=new PlayerDTO();
		playerDTO4.setName("Sachin");
		playerDTO4.setCountry("Karnataka");
		playerDTO4.setSports(new String[] {"Kabbaddi"});
		playerDTO4.setAwards(new String[] {"Arjuna"});
		
		System.out.println(playerDTO4.getName());
		System.out.println(playerDTO4.getCountry());
		System.out.println(Arrays.toString(playerDTO4.getSports()));
		System.out.println(Arrays.toString(playerDTO4.getAwards()));
		System.out.println(" ");
		
		PlayerDTO playerDTO5=new PlayerDTO();
		playerDTO5.setName("Sabeer");
		playerDTO5.setCountry("karnataka");
		playerDTO5.setSports(new String[] {"kabbaddi"});
		playerDTO5.setAwards(new String[] {"Arjuna"});
		
		System.out.println(playerDTO5.getName());
		System.out.println(playerDTO5.getCountry());
		System.out.println(Arrays.toString(playerDTO5.getSports()));
		System.out.println(Arrays.toString(playerDTO5.getAwards()));
		

	}


}
