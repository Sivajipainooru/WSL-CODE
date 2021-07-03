package WorkSiteLabs.WSL;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Invalid_Email_ErrorMessag_Test extends InvalidEmails_ErrorMessage 
{
	@Test
	public void allErrorEmailmessages()
	{
		Base b= new Base();
		b.launchingBrowser();
		allConfirmationMethods();
	}

}
