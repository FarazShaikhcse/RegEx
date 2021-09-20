import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		final String first_name_pt = "^[A-Z][a-zA-Z]{2,}";
		final String last_name_pt = "^[A-Z][a-zA-Z]{2,}";

		final String emailpt = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";

		final String mob = "[1-9][0-9]\\s[1-9][0-9]{9}";

		final String passwordpt = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

		String firstName = "Faraz";
		String lastName = "Shaikh";
		String email[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.con", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com",
				"abc@gmail.com.com", "abc+100@gmail.com" };
		String mobno = "91 9876543210";
		String password = "hypeSqu@d11";

		System.out.print("First name: ");
		validate(first_name_pt, firstName);
		System.out.print("Last name: ");
		validate(last_name_pt, lastName);
		for (String string : email) {

			System.out.print("Email: ");
			validate(emailpt, string);
		}
		System.out.print("Mobile no: ");
		validate(mob, mobno);
		System.out.print("Password: ");
		validate(passwordpt, password);

	}

	private static void validate(String pattern, String string) {

		if (Pattern.matches(pattern, string)) {

			System.out.println(string + " is valid");
		} else {
			System.out.println(string + " is invalid");
		}

	}

}