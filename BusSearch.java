
public class BusSearch{

	private static String[] items = { "KSRTC", "VRL", "RAJ", "RedBUS" };

	public static void search(String bus) {
		System.out.println("search kareyuvudu");
		System.out.println("Total items available" + items.length);
		System.out.println("arg1 :" + bus);
		boolean itemFound = false;
		for (int count = 0; count < items.length; count++) {
			//System.out.println("item at position " + items[count]);
			String item = items[count];
			if (item.equals(bus)) {
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