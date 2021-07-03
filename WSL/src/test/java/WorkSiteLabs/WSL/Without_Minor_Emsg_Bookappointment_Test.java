package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class Without_Minor_Emsg_Bookappointment_Test extends Without_Minor_Error_BookAppointment{
	@Test
	public void allErrorMessages()
	{
		Base b= new Base();
		b.launchingBrowser();
		bookAppointmentFlow();
		selectLocation();
		allMinorMethods();
	}

}
