package WorkSiteLabs.WSL;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class BookAppointmentTest extends BookAppoinmentNow
{
	String data_final_value[][];
   //@Test(dataProvider="Required_Data")
	@Test(dataProvider="Required_Data")
	public void allBookAppointmentDetails(String PhNo,String EmailID,String ConfirmEmailID,
			String MajorFN,String MajorLN,String MajorDOB,
			String Minor1_FN,String Minor1_LN,String Minor1_DOB,String Minor1_Relation,String streetAd,String city, String Zipcode,String DepartureDateAndTime,
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
		  minorDetails(Minor1_FN,Minor1_LN,Minor1_DOB,Minor1_Relation);
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
	@DataProvider(name="Required_Data")
	public String[][] loginDataProvider() throws IOException 
	{ 
		GetExcelDataClass d=new GetExcelDataClass();
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
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
//@Test
//  public void bookapointmenttest() throws InterruptedException, IOException
//  {
//	
//	  Base b=new Base();
//	  b.launchingBrowser();
//	getDataFromSheet();
//	  bookAppoinmentNow();
////	  phoneNumber();
//	  checkBox();
//	  savecontinue();
//	  email();
//	  saveContinueOption();
//	  selectLocation();
//	  majorDetails();
//	  minorDetails();
//	  yourAddressPage();
//	  departureDateandSlots();
//	  symptoms();
//	  chronicMedicalCondition();
//	  covidConfirmedPage();
//	  demoGraphicPage();
//	  hippaPage();
//	  confirmBookAppointment();
//	  cardDetails();
//	
//  }

}
