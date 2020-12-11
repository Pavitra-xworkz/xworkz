package com.xworkz.DTO;

import java.util.Arrays;

public class CountryDTOTester {
	public static void main(String[] args) {

		CountryDTO dto = new CountryDTO();
		System.out.println(dto.getName());
		System.out.println(dto.getPopulation());

		CountryDTO dto1 = new CountryDTO("Russia", "asia");

		System.out.println(dto1.getName());
		System.out.println(dto1.getContinent());

		CountryDTO dto2 = new CountryDTO(1380000543, "Modi jii", "Ramnath kovind");

		System.out.println(dto2.getPopulation());
		System.out.println(dto2.getPrimeMinister());
		System.out.println(dto2.getPresident());

		String[] allStates = new String[6];
		allStates[0] = "Karnataka";
		allStates[1] = "TamilNadu";
		allStates[2] = "Madhya Pradesh";
		allStates[3] = "Goa";
		allStates[4] = "Uttar Pradesh";

		String[] AllLan = new String[8];
		AllLan[0] = "Kannada";
		AllLan[1] = "English";
		AllLan[2] = "Hindi";
		AllLan[3] = "Tegalu";
		AllLan[4] = "Tamil";
		AllLan[5] = "Marati";
		AllLan[6] = "Lambani";
		AllLan[7] = "Bengoli";

		CountryDTO dto3 = new CountryDTO(allStates, AllLan);
		System.out.println(Arrays.toString(AllLan));
		System.out.println(Arrays.toString(allStates));

	}

}
