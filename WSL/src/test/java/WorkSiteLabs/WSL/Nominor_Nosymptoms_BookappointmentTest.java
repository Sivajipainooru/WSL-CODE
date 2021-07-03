package WorkSiteLabs.WSL;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Nominor_Nosymptoms_BookappointmentTest extends Nominor_Nosymptoms_Bookappointment {
	String data_final_value[][];
	@Test(dataProvider="Required_Data")
	public void noMinorNoSymptoms(String PhNo,String EmailID,String ConfirmEmailID,
			String MajorFN,String MajorLN,String MajorDOB,
			String streetAd,String city, String Zipcode,String DepartureDateAndTime,
			String CardNo,String ExpDate,String CVC ,String CardZipcode) throws IOException, InterruptedException
	{
		  launchingBrowser();
		  bookAppoinmentNow();
		  phoneNumber(PhNo);
		  checkBox();
		  savecontinue();
		  email(EmailID,ConfirmEmailID);
		  saveContinueOption();
		  selectLocation();
		  majorDetails(MajorFN,MajorLN,MajorDOB);
		//  minorDetails(Minor1_FN,Minor1_LN,Minor1_DOB,Minor1_Relation);
		  yourAddressPage(streetAd,city,Zipcode);
		  departureDateandSlots(DepartureDateAndTime);
		  symptoms();
		  chronicMedicalCondition();
		  covidConfirmedPage();
		  demoGraphicPage();
		  hippaPage();
		  confirmBookAppointment();
		  cardDetails(CardNo,ExpDate,CVC,CardZipcode);
		
	
	}
	@BeforeMethod
	@DataProvider(name="Required_Data")
	public String[][] loginDataProvider() throws IOException 
	{ 
		GetExcelData3 d=new GetExcelData3();
		data_final_value=d.getDataFromSheet();
		for(int i=1;i<data_final_value.length;i++)
		{
			for(int j=0;j<data_final_value[i].length;j++)
			{
				System.out.println(i + " " + j +" " +data_final_value[i][j]);
			}
		}
		return data_final_value;
	}

}


