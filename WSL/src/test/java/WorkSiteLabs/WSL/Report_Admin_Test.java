package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class Report_Admin_Test extends Reports_Admin{
	@Test
	public void allReportsData() throws InterruptedException
	{
		Base b =new  Base();
		b.launchingAdminBrowser();
		reportsdmin();
	}

}
