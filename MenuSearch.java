

public class MenuSearch {

	public static void main(String[] args) {

		System.out.println("jvm kareyuvudu main");

		System.out.println("Total items to search" + PhoneDirectory.totalItems());
		PhoneDirectory.search("Food");

		System.out.println("main nirgamana");
	}

}


