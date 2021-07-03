package WorkSiteLabs.WSL;

import org.testng.annotations.Test;

public class Resuts_Slotoccupancy_AdminTest extends ResultsandSlotOccupancy{
	@Test
	public void allResultsAndSlotData() throws InterruptedException
	{
		Base b =new Base();
		b.launchingAdminBrowser();
		allResults();
		allSlotOccupancy();
	}

}
