package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class Day_Wise_Appointment_Test extends Day_Wise_Appointment {
	@Test
	public void allDayWiseAppointmentMethods() throws InterruptedException
	{
		Base b =new Base();
		b.launchingAdminBrowser();
		alldaywisedata();
		moreDetails();
	}

}
