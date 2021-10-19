package MultitenancyTest;

import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.Interview;

public class InterviewTest extends Interview{
	@Test
	public void testData()
	{
		Base g=new Base();
		g.email();
		test();
	}

}
