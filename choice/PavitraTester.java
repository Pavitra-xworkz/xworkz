package com.xworkz.choice;

import java.util.Optional;

import com.xworkz.choice.dao.GiftDAO;
import com.xworkz.choice.dao.GiftDAOImpl;
import com.xworkz.choice.dto.GiftDTO;
import com.xworkz.choice.dto.GiftDTO.GiftType;

public class PavitraTester {
	public static void main(String[] args) {
		GiftDAO dao=new GiftDAOImpl();
		
		GiftDTO dto = new GiftDTO();
		
		dto.setGivenBy(Optional.of("Rohan"));
		dto.setType(Optional.of(GiftType.CHOCOLATE));
		dto.setPrice(100);
		
		dao.Save(dto);
		
				
		Optional<GiftDTO>opt=dao.fetchByGivenBy("Manu");
		opt.ifPresent(v->System.out.println(v));
	}

}
