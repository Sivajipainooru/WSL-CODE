package WorkSiteLabs.WSL;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Two_Minor_Two_Symptoms_BookAppointmentTest extends TwoMinor_TwoSymptoms_BookAppointment {
	String data_final_value[][];
	   //@Test(dataProvider="Required_Data")
		@Test(dataProvider="Required_Data")
		public void twoMinorsData(String PhNo,String EmailID,String ConfirmEmailID,
				String MajorFN,String MajorLN,String MajorDOB,
				String Minor1_FN,String Minor1_LN,String Minor1_DOB,String Minor1_Relation,String Minor2_FN,String Minor2_LN,String Minor2_DOB,String Minor2_Relation,String streetAd,String city, String Zipcode,String DepartureDateAndTime,
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
			  minor2details(Minor2_FN,Minor2_LN,Minor2_DOB,Minor2_Relation);
			  yourAddressPage(streetAd,city,Zipcode);
			  departureDateandSlots(DepartureDateAndTime);
			  symptoms();
			  chronicMedicalCondition();
			  covidConfirmedPage();
			  demoGraphicPage();
			  hippaPage();
			  confirmBookAppointment();
			  cardDetails(CardNo,ExpDate,CVC,CardZipcode);
			  
//			  closeBrowser();
			
		
		}
		@DataProvider(name="Required_Data")
		public String[][] loginDataProvider() throws IOException 
		{ 
			GetExcelData2 d=new GetExcelData2();
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


	}


