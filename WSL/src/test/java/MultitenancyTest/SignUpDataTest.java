package MultitenancyTest;

import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.SignUpData;

public class SignUpDataTest extends SignUpData {
	@Test
	public void allsignuplinks() throws InterruptedException
	{
		Base b      = new Base();
		b.LaunchingMultitenancy();
		b.Domestic();
		signUpDetails();
		majorMinorDobPage();
		phoneNumberPage();
		addressPage();
		demographicsPage();
	}

}
