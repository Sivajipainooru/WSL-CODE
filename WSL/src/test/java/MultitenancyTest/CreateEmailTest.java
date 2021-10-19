package MultitenancyTest;

import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.CreateEmail;

public class CreateEmailTest extends CreateEmail{
	@Test
	public void trail() throws InterruptedException
	{
		Base b=new Base();
		b.email();
		emailTest();
	}

}
