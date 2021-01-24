package com.xworkz.license;

import java.util.Date;

import com.xworkz.license.Constant.BloodGroup;
import com.xworkz.license.Constant.Gender;
import com.xworkz.license.Constant.IdProof;
import com.xworkz.license.Constant.VehicleType;
import com.xworkz.license.DAO.LicenseDAO;
import com.xworkz.license.DAO.imp.LicenseDAOImp;
import com.xworkz.license.DTO.AddressDTO;
import com.xworkz.license.DTO.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
		
		AddressDTO addressDto=new AddressDTO(11,"Karuneshwar nagar",585102,"gulbarga","karnataka","near sanjana hospital");
		Date dob=new Date();


		LicenseDTO dto=new LicenseDTO("surakshita", 23, 9876543218L, dob, addressDto, Gender.FEMALE, BloodGroup.AB_NEGATIVE);
		dto.setDisability(false);
		dto.setIdProof(IdProof.ADDHAR);
		dto.setIdProofNo("6765 7676 7543");
		dto.setStartdate(new Date());
		dto.setVehicleType(VehicleType.TWO_WHEELER);
		
		LicenseDAO dao=new LicenseDAOImp();
		dao.save(dto);

	}

}
