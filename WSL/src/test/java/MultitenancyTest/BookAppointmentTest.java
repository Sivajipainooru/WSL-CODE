package MultitenancyTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.BookAppointment;

public class BookAppointmentTest extends BookAppointment{
	@Test
	public void allMethods() throws InterruptedException
	{
		Base c=new Base();
		c.LaunchingMultitenancy();
		c.Domestic();
		c.signInPage();
		Thread.sleep(3000);
		travellingTypeByAir();
		
	}

}
