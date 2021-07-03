package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class Address_Page_Validation_BookAppointment_Test extends Address_Page_Validation_BookAppointment {
	@Test
	public void allMethodValidations()
	{
		Base b= new Base();
		b.launchingBrowser();
		allAddressValidation();
		selectLocation();
		dobPageDetails();
		addressPageDetails();
		
	}

}
