package MultitenancyTest;

import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.SignInOldAccount;

public class SignInOldAccountTest extends SignInOldAccount{
	@Test
	public void signinolddatamethods() throws InterruptedException
	{
		Base b =new Base();
		b.LaunchingMultitenancy();
		b.Domestic();
		signUpDetails();
		redirectingToSignIn();
	
	}
	

}
