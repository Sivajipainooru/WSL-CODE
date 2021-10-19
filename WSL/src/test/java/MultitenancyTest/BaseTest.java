package MultitenancyTest;

import org.testng.annotations.Test;

import Multitenancy.Base;

public class BaseTest extends Base {
	@Test
	public void multiUrls() throws InterruptedException
	{
		LaunchingMultitenancy();
		Domestic();
		signInPage();
	}

}
