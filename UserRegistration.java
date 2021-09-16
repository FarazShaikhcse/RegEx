import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		final String first_name_pt = "^[A-Z][a-z]{2,}";

		String firstName = "Faraz";

		if (Pattern.matches(first_name_pt, firstName)) {
			
			System.out.println("First name is valid");
		} 
		else {
			
			System.out.println("First name is invalid");
		}

	}

}