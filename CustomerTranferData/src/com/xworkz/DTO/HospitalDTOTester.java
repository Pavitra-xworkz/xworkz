package com.xworkz.DTO;

import com.xworkz.DTO.HospitalDTO;
import com.xworkz.DTO.AppointmentDTO;

public class HospitalDTOTester {

	public static void main(String[] args) {
		HospitalDTO hospital = new HospitalDTO("JEMES", "Gadag");

		hospital.appointment("Pavitra", 8050201916l, 22, "HeadAche", "Dr.Pushpa");

		AppointmentDTO appointment = hospital.getAppointmentDTO();
		System.out.println("patient name " + appointment.getPatientName());
		System.out.println("mobile number " + appointment.getMobileNumber());
		System.out.println("age " + appointment.getAge());
		System.out.println("reason " + appointment.getReason());
		System.out.println("doctor name " + appointment.getDoctorName());

	}

}
