
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for User details validation
 */
public class UserRegTest 
{
	 String firstName = "Faraz";
	 String lastName = "Shaikh";
	 String email[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.con",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" }; 
								
	 String mob = "91 9876543210";
	 String pass = "hypeSqu@d11";
   
    
    @Test
    public void validateFirstName()
    {
    	 
        assertTrue(UserRegistration.validate(UserRegistration.first_name_pt, firstName));
        
    }
    @Test
    public void validateLastName()
    {
    	 
    	assertTrue(UserRegistration.validate(UserRegistration.last_name_pt, lastName));
        
    }
    @Test
    public void validateEmail()
    {
    	 for (String string : email) 
    		assertTrue(UserRegistration.validate(UserRegistration.emailpt, string));
        
    }
    @Test
    public void validateMobile()
    {
    	assertTrue(UserRegistration.validate(UserRegistration.mob, mob));
    }
    @Test
    public void validatePassword()
    {
    	assertTrue(UserRegistration.validate(UserRegistration.passwordpt, pass));
    }
    
    
    
}