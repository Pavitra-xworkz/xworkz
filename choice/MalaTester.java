package com.xworkz.choice;

import java.util.Optional;

import com.xworkz.choice.dto.GiftDTO;
import com.xworkz.choice.dto.GiftDTO.GiftType;
import com.xworkz.choice.dto.WarDTO;

public class MalaTester {

	public static void main(String[] args) {

		GiftDTO dto = new GiftDTO();

		Optional<GiftType> optGiftType = Optional.ofNullable(GiftType.DOLL);
		dto.setPrice(1000);
		dto.setType(optGiftType);

		Optional<GiftType> type = dto.getType();
		// type.ifPresent(System.out::println);
		type.ifPresent(r -> System.out.println(r));

		dto.setGivenBy(Optional.ofNullable("Pratthii"));
		dto.getGivenBy().ifPresent(v -> System.out.println(v.toUpperCase()));
		dto.getGivenBy().map(String::toUpperCase);

		WarDTO warDTO = new WarDTO();
		warDTO.setCountry("India");
		warDTO.setName("Kargil");
		System.out.println(warDTO);

	}
}
