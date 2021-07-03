package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class Information_Page_Errormessages_BookAppointment_Test extends Information_Page_Errors_BookAppointment {
@Test
public void allInformation()
{
	Base b=new Base();
	b.launchingBrowser();
	allInformationMethods();
	selectLocation();
	informationPageDetails();
}
}
