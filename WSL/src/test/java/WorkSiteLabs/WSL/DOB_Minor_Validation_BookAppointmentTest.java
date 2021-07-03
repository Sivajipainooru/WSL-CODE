package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class DOB_Minor_Validation_BookAppointmentTest extends DOB_Minor_Validation_BookAppointment {
	@Test
	public void allMinorValidationMethods()
	{
		Base b=new Base();
		b.launchingBrowser();
		allDobValues();
		selectLocation();
		dobPageDetails();
	}

}
