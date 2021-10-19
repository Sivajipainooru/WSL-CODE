package MultitenancyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.Interview2;

public class Interview2Test extends Interview2{
	@Test
	public void trails()
	{
		Base h=new Base();
		h.email();
		test3();
		
	}
	

}
