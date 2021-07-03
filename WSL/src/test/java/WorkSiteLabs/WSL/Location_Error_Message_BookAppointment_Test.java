package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class Location_Error_Message_BookAppointment_Test extends Location_Error_Message_BookAppointment
{
	@Test
	public void allLocationMessages() throws InterruptedException
	{
	Base b = new Base();
	b.launchingBrowser();
	allLocationMethods();
	}
	

}
