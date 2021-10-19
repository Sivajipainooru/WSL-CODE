package MultitenancyTest;

import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.Spicejet;

public class SpiceTest extends Spicejet{
	@Test
	public void testmethod() throws InterruptedException
	{
		Base b=new Base();
		b.Spicejetd();
		methods();
	}

}
