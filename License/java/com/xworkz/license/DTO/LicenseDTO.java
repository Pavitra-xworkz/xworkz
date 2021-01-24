package com.xworkz.license.DTO;

import java.util.Date;

import com.xworkz.license.Constant.BloodGroup;
import com.xworkz.license.Constant.Gender;
import com.xworkz.license.Constant.IdProof;
import com.xworkz.license.Constant.VehicleType;

public class LicenseDTO extends CommonDTO{
	
	private Date startdate;
	private IdProof idProof;
	private String idProofNo;
	private boolean disability;
	private VehicleType vehicleType;
	
	
	
	public LicenseDTO() {
		super();
	
	}
	public LicenseDTO(String name, int age, long mobileNo, Date dob, AddressDTO addressDto, Gender gender,
			BloodGroup bloodGroup) {
		super(name, age, mobileNo, dob, addressDto, gender, bloodGroup);
		
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public IdProof getIdProof() {
		return idProof;
	}
	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}
	public String getIdProofNo() {
		return idProofNo;
	}
	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}
	public boolean isDisability() {
		return disability;
	}
	public void setDisability(boolean disability) {
		this.disability = disability;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	

}
