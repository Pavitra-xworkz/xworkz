package com.xworkz.inheritance.states;

import com.xworkz.inheritance.scheme.UnionGovernment;
import com.xworkz.inheritance.states.KarnatakaGovernment;

//jvm
public class StateTester {

	public static void main(String[] args) {

		UnionGovernment government = new KarnatakaGovernment();
		government.atalPensionYogana();
		
		//exmple abstrct class implemntn

		Number number = new Integer(56);
		number = new Double(78);
		// abstract met

	}

}
