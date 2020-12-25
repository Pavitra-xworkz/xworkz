package com.xworkz.Vtu;

import com.xworkz.Vtu.engineer.constants.Branch;
import com.xworkz.Vtu.engineer.Engineer;
import com.xworkz.Vtu.engineer.CSEngineer;
import com.xworkz.Vtu.engineer.TCEnginner;

public class VTUTester {

	public static void main(String[] args) {

		Engineer engineer = new Engineer();
		System.out.println(engineer.USN);
		System.out.println(engineer.branch);
		engineer.problemSolving();

		CSEngineer csEngineer = new CSEngineer();
		System.out.println(csEngineer.USN);
		System.out.println(csEngineer.getBranch());
		System.out.println(csEngineer.getParentBranch());
		csEngineer.problemSolving();

		Engineer engineer2 = new CSEngineer();
		System.out.println(engineer2.branch);
		CSEngineer csEnginner2 = (CSEngineer) engineer2;
		System.out.println(csEnginner2.branch);
		engineer2.problemSolving();
		csEnginner2.problemSolving();
		TCEnginner tcEngineer = new TCEnginner();
		System.out.println(tcEngineer.branch);
		tcEngineer.problemSolving();
		System.out.println(tcEngineer.branchE);
		// tcEngineer.branchE = Branch.BIOTECH;
		System.out.println(tcEngineer.branchE);

	}

}
