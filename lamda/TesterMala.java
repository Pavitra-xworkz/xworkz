package com.xworkz.lamda;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.lamda.dto.FreedomFighterDTO;
import com.xworkz.lamda.dto.FreedomFighterDTO.Gender;

public class TesterMala {
	public static void main(String[] args) {
		FreedomFighterDTO fighterDTO1 = new FreedomFighterDTO("Bhagat Singh", "India", Gender.MALE);

		FreedomFighterDTO fighterDTO2 = new FreedomFighterDTO("KitturaniChannamma", "India", Gender.FEMALE);

		FreedomFighterDTO fighterDTO3 = new FreedomFighterDTO("Obbavva", "India", Gender.FEMALE);

		FreedomFighterDTO fighterDTO4 = new FreedomFighterDTO("SubhashChandraBhosh", "India", Gender.MALE);

		FreedomFighterDTO fighterDTO5 = new FreedomFighterDTO("Obbavva", "India", Gender.FEMALE);

		Set<FreedomFighterDTO> fighterDTOs = new HashSet<FreedomFighterDTO>();
		fighterDTOs.add(fighterDTO1);
		fighterDTOs.add(fighterDTO2);
		fighterDTOs.add(fighterDTO3);
		fighterDTOs.add(fighterDTO4);
		fighterDTOs.add(fighterDTO5);

		System.out.println(fighterDTOs.size());
		fighterDTOs.forEach(fighter -> System.out.println(fighter.getName()));
		// test for commit

	}
}
