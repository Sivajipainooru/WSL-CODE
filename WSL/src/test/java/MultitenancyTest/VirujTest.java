package MultitenancyTest;

import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.Viruj;

public class VirujTest extends Viruj{
	@Test
	public void dataTest() throws InterruptedException
	{
		Base j=new Base();
		j.viruj();
		data();
	}

}
