package com.xworkz.license.DAO;

import com.xworkz.license.Constant.VehicleType;
import com.xworkz.license.DTO.LicenseDTO;

public interface LicenseDAO {

	public void save(LicenseDTO dto);

	LicenseDTO findByIdProofNo(String idProofNo);

	boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type);

	boolean deleteByIdProofNo(String idPrrof);

}