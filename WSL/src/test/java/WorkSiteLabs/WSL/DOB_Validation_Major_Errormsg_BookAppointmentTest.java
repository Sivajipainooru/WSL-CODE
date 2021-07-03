package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class DOB_Validation_Major_Errormsg_BookAppointmentTest extends DOB_Validation_Major_Bookappointment{
	@Test
	public void allValidationMessages()
	{
		Base b=new Base();
		b.launchingBrowser();
		allDobValues();
		selectLocation();
		dobPageDetails();
	}
	

}
 