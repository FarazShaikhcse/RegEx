
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for User details validation
 */
public class UserRegTest {
	String firstName = "faraz";
	String lastName = "Shaikh";
	String email[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.con", "abc-100@abc.net",
			"abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };

	String mob = "91 9876543210";
	String pass = "hypeSqu@d11";

	@Test
	public void validateFirstName() {
		try {
			assertTrue(UserRegistration.validate(UserRegistration.first_name_pt, firstName));
		} catch (UserRegException e) {
			System.out.println(e);
		}

	}

	@Test
	public void validateLastName() {
		try {
			assertTrue(UserRegistration.validate(UserRegistration.last_name_pt, lastName));
		} catch (UserRegException e) {
			System.out.println(e);
		}
		

	}

	@Test
	public void validateEmail() {
		try {
			for (String string : email)
				assertTrue(UserRegistration.validate(UserRegistration.emailpt, string));

		} catch (UserRegException e) {
			System.out.println(e);
		}
		
	}

	@Test
	public void validateMobile() {
		try {
			assertTrue(UserRegistration.validate(UserRegistration.mob, mob));
		} catch (UserRegException e) {
			System.out.println(e);
		}
		
	}

	@Test
	public void validatePassword() {
		try {
			assertTrue(UserRegistration.validate(UserRegistration.passwordpt, pass));
		} catch (UserRegException e) {
			System.out.println(e);
		}
		
	}

}
