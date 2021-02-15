package com.xworkz.lamda.mapinterface;

import java.util.Optional;

public class OptionalTester {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String email = null;

		System.out.println(email);

		if (email != null) {

			System.out.println(email.toUpperCase());

		}
		Optional<String> optional = Optional.of("sahana@xworkz.com");// .of will return not null values

		System.out.println(optional.isPresent());// ispresent will return boolean value if value is not null then true
													// ,otherwise false

		if (optional.isPresent()) {
			System.out.println(optional.get());// .get will return not null value that present in optional

			Optional<Integer> yearOptional = Optional.empty();
			System.out.println(yearOptional.isPresent());// return false because ispresent contain some value it is not
															// empty.
			yearOptional.ifPresent(System.out::println);

			Optional<String> country = Optional.ofNullable("india");
			country.ifPresent(e -> {
				String value = country.map(String::toUpperCase).get();
				System.out.println(value);

			});
			String str = country.orElse("Srilanka");
			System.out.println(str);

		}
		

	}
}
