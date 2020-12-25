package com.xworkz.Vtu.engineer;
import com.xworkz.Vtu.engineer.constants.*;

public class Engineer {

	public String USN;
	public Branch branch = Branch.IS;

	public void problemSolving() {
		System.out.println("invoked problemSolving");
		System.out.println("problem solved by" + this.branch);
	}

	public final void bunking() {
		System.out.println("enginner bunked");
	}
}
