package com;

public class PhoneDirectory{

	private static String[] items = { "TelephoneNomber", "PhoneNomber", "SubscribeNomber", "ServiceNomber" };

	public static void search(String nomber) {
		System.out.println("search kareyuvudu");
		System.out.println("Total items available" + items.length);
		System.out.println("arg1 :" + nomber);
		boolean itemFound = false;
		for (int count = 0; count < items.length; count++) {
			//System.out.println("item at position " + items[count]);
			String item = items[count];
			if (item.equals(nomber)) {
				// System.out.println("item is found");
				itemFound = true;
				break;
			} else {
				// System.out.println("item is not found");
				itemFound = false;
			}

		}

		if (itemFound) {
			System.out.println("item is found ");
		} else {
			System.out.println("item is not found");
		}
		System.out.println("search nirgamana");

	}

	public static int totalItems() {
		return items.length;
	}

}
