package com.xworkz.Vtu.engineer;


import com.xworkz.Vtu.engineer.constants.Branch;

public class TCEnginner extends Engineer {
	public Branch branch = Branch.TC;
	public final Branch branchE=Branch.EEE;

	public void problemSolving() {
		System.out.println("Problem solved by TC engineer");
		System.out.println(this.branch);
	}

}
