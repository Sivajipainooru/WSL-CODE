package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class Admin_Keymetrics_Test extends Keymetrics_Admin {
	@Test
	public void allKeymetricsMethods()
	{
		Base b=new Base();
		b.launchingAdminBrowser();
		allKeyMetricsMethods();
	}

}
