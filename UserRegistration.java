import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		final String first_name_pt = "^[A-Z][a-zA-Z]{2,}";
		final String last_name_pt = "^[A-Z][a-zA-Z]{2,}";
		
		final String username = "^[A-Za-z][A-Za-z0-9+-]{2,}([.][A-Za-z0-9]{2,})?";
		final String domain = "\\@[a-z]{3,}\\.[a-z]{2,}([.][a-z]{2,})?";
		final String emailpt = username + domain;
		
		final String mob = "[1-9][0-9]\\s[1-9][0-9]{9}";
		
		final String passwordpt = "[0-9A-Za-z]{8,}";

		String firstName = "Faraz";
		String lastName = "Shaikh";
		String email = "farazssashaikh@gmail.com";
		String mobno = "91 9876543210";
		String password = "hypesquad";
		
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
		if (Pattern.matches(mob, mobno)) { 
			
			System.out.println("Mobile number is valid");
		} 
		else {
			System.out.println("Mobile number is invalid");
		}
		if (Pattern.matches(passwordpt, password)) { 
			
			System.out.println("Password is valid");
		} 
		else {
			System.out.println("Password is invalid");
		}

	}

}