package MultitenancyTest;

import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.TooltipValidation;

public class TooltipValidationTest extends TooltipValidation{
	@Test
public void run() throws InterruptedException
{
	Base d=new Base();
	d.ValidationMsg();
	gitData();
}
}
