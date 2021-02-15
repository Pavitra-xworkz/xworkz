package com.xworkz.license;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.license.Constant.BloodGroup;
import com.xworkz.license.Constant.Gender;
import com.xworkz.license.Constant.IdProof;
import com.xworkz.license.Constant.VehicleType;
import com.xworkz.license.DAO.LicenseDAO;
import com.xworkz.license.DAO.impl.LicenseDAOImp;
import com.xworkz.license.DTO.AddressDTO;
import com.xworkz.license.DTO.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {

		AddressDTO addressDTO = new AddressDTO(3254, "NA", 560003, "Soundatti", "Soundatti", "Ka");

		Date dob = new Date();// 16/10/1997
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		try {
			dob=format.parse("28/08/1998");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		LicenseDTO dto = new LicenseDTO("Pavitra", 23, addressDTO, dob, 8050201916l, BloodGroup.O_POSITIVE,Gender.FEMALE);
		dto.setIdProof(IdProof.AADHAR);
		dto.setIdProofNo("6363 8787 6449");
		dto.setCommercial(false);
		dto.setDisablity(false);
		dto.setStartdate(new Date());// change to future
		dto.setVehicleType(VehicleType.TWO_WHEELER);

		LicenseDAO dao = new LicenseDAOImp();
		dao.save(dto);// DAO
			// CRUD----
		LicenseDTO dtoFound = dao.findByIdProofNo("6363 8787 6449");
		System.out.println(dtoFound);

		boolean updated=dao.updateVehicleTypeByIdProofNo("6363 8787 6449", VehicleType.LMV);
		System.out.println("updated "+ updated);
		
		
		LicenseDTO dtoafterUpdate=dao.findByIdProofNo("6363 8787 6449");
		System.out.println(dtoafterUpdate);
		
		boolean deleted=dao.deleteByIdProofNo("6363 8787 6449");
		System.out.println("deleted "+deleted);
		
		
	}
}
