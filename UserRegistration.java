import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		final String first_name_pt = "^[A-Z][a-zA-Z]{2,}";
		final String last_name_pt = "^[A-Z][a-zA-Z]{2,}";

		String firstName = "Faraz";
		String lastName = "Shaikh";

		if (Pattern.matches(first_name_pt, firstName)) {

			System.out.println("First name is valid");
		} else {

			System.out.println("First name is invalid");
		}

		if (Pattern.matches(last_name_pt, lastName)) {

			System.out.println("Last name is valid");

		} else {

			System.out.println("Last name is invalid");
		}

	}

}