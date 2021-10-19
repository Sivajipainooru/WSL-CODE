package MultitenancyTest;

import java.io.IOException;

import org.testng.annotations.Test;

import Multitenancy.DataDriverSheet;

public class DataDrivenSheetTest extends DataDriverSheet {
	@Test
	public void gettingDataFromExcel() throws IOException
	{
		DataDriverSheet d=new DataDriverSheet();
	    d.trail();
	}

}
