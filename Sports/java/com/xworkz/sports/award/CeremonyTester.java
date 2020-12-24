package com.xworkz.sports.award;

import com.xworkz.sports.award.Ceremony;

public class CeremonyTester {

	public static void main(String[] args) {

		Ceremony ceremony = new Ceremony("Agadi Fest");

		String[] foodItems = { "Jamoon", "Kaju Barfi", "Pepper Chicken", "Fried Rice", "Mysore Pak" };

		ceremony.setFoods(foodItems);
		// ref
		ceremony.distributeAward("Pavitra", " Oscar");

		// ceremony.displayFoods();
		ceremony.displayCeremoryNameAndFoods();

		ceremony.accessParentMembers();

		int code = ceremony.hashCode();
		System.out.println(code);

	}

}
