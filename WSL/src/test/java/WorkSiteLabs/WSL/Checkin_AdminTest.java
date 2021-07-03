package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class Checkin_AdminTest extends Checkin_Admin {
	@Test
	public void allCheckinMethods()
	{
		Base b =new Base();
		b.launchingAdminBrowser();
		allCheckInData();
		more();
	}

}
