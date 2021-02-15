package com.xworkz.choice.dao;

import java.util.Optional;

import com.xworkz.choice.dto.GiftDTO;

public interface GiftDAO {
	public void Save(GiftDTO dto);
	
	public Optional<GiftDTO>
	
	fetchByGivenBy(String name);

}
