package com.xworkz.license.DAO.imp;

import com.xworkz.license.DAO.LicenseDAO;
import com.xworkz.license.DTO.LicenseDTO;

public class LicenseDAOImp implements LicenseDAO {

	@Override
	public void save(LicenseDTO dto) {
		
		System.out.println("license dao save is invokes:");
		System.out.println("save dto:"+dto);
		
	}

	
	
	

}
