package com.xworkz.DTO;

import com.xworkz.DTO.AppointmentDTO;

public class HospitalDTO {
	private String name;
	private String location;
	private int noOfAppointments = 3;
	private AppointmentDTO appointmentDTO;

	public HospitalDTO(String name, String location) {

		this.name = name;
		this.location = location;
	}

	public void appointment(String name, long mobile, int age, String reason, String doctor) {
		this.appointmentDTO = new AppointmentDTO(name, mobile, reason, age, doctor);
	}

	public AppointmentDTO getAppointmentDTO() {
		return appointmentDTO;
	}

	public void setAppointmentDTO(AppointmentDTO appointmentDTO) {
		this.appointmentDTO = appointmentDTO;
	}
}
