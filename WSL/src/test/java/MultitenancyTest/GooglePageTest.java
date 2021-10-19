package MultitenancyTest;

import java.io.IOException;

import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.GooglePage;

public class GooglePageTest extends GooglePage {
	@Test
	public void googleTestMethods() throws IOException
	{
		Base b=new Base();
		b.googlepagescreenshot();
		testScreenShot();
	}

}
