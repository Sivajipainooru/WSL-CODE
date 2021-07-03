package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class AdminDashboardTest extends AdminDashboard {
	@Test
	public void allDashBoardMethods()
	{
		Base b=new Base();
		b.launchingAdminBrowser();
		adminLogin();
		
	}
}
