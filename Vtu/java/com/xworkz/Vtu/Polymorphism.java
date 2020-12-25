package com.xworkz.Vtu;


import com.xworkz.Vtu.engineer.CSEngineer;
import com.xworkz.Vtu.engineer.Engineer;
import com.xworkz.Vtu.engineer.TCEnginner;

public class Polymorphism {

	public static void main(String[] args) {
			Engineer engineer=new CSEngineer();
			Engineer engineer1=new TCEnginner();
			
			engineer.problemSolving();
			engineer1.problemSolving();

	}

}
