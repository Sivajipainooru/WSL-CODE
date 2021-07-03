package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class Manage_AdminTest extends Manage_Admin{
	@Test
	public void allmanageheadings() throws InterruptedException
	{
    Base b=new Base();
    b.launchingAdminBrowser();
	allManageOptions();
	}

}
