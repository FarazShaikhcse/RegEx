import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		final String first_name_pt = "^[A-Z][a-zA-Z]{2,}";
		final String last_name_pt = "^[A-Z][a-zA-Z]{2,}";
		
		final String username = "^[A-Za-z][A-Za-z0-9+-]{2,}([.][A-Za-z0-9]{2,})?";
		final String domain = "\\@[a-z]{3,}\\.[a-z]{2,}([.][a-z]{2,})?";
		final String emailpt = username + domain;

		String firstName = "Faraz";
		String lastName = "Shaikh";
		String email = "farazssashaikh@gmail.com";

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
		if (Pattern.matches(emailpt, email)) { 
			
			System.out.println("Email is valid");
		} 
		else {
			System.out.println("Email is invalid");
		}

	}

}