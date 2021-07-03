package WorkSiteLabs.WSL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Without_Minor_Error_BookAppointment extends Base {
	By BookAppoinmentN      = By.xpath("//button[text()='Book Appointment Now']");
	By PhoneNo              = By.xpath("//input[@name='phone']");
	By Checkbx              = By.xpath("//input[@name='sendMessagesAboutTestResults']");
	By Savecontinue0        = By.xpath("//button[text()='Save & Continue']");
	By Email                = By.xpath("//input[@name='email']");
	By Confirmemail         = By.xpath("//input[@name='confirmEmail']");
	By Savecontinue         = By.xpath("//button[text()='Save & Continue']");
	By Selectalllocation    = By.xpath("html/body/div/div/div/div/div/form/div/button/div[1]/div");
	//By Selectalllocation    = By.xpath("(//div[@class='sc-jgPznn eEthnu'])[9]");
	By Majorcheckbox        = By.xpath("//input[@name='haCustomer']");
	By Firstnam1             = By.xpath("//input[@name='firstName']");
	By Lastnam1              = By.xpath("//input[@name='lastName']");
	By Datebirth1            = By.xpath("//input[@placeholder='MM/DD/YYYY']");
	By Passportcoutry1       = By.xpath("//div[@class=' css-14e1rle']");
	
	By Dropdownpassportcoutry= By.xpath("//div[@class=' css-26l3qy-menu']/div/div");
	By Passport             = By.xpath("//input[@name='passportNo']");
	By Minorcheckbox        = By.xpath("//input[@name='hasMinors']");
	By SaveContinue3        = By.xpath("//button[text()='Save & Continue']");
	By ErrorMessage         = By.xpath("(//div[@class='sc-pNWxx gSlGwS'])[3]");
	public void bookAppointmentFlow()
	{
		 waitForElement(BookAppoinmentN);
		 WebElement ban      = driver.findElement(BookAppoinmentN);
		 ban.click();
	      //Click phone number option after enter the phone number
         WebElement pn       = driver.findElement(PhoneNo);
		 pn.sendKeys("9490076668");
		//Select Check box
	     WebElement cb       = driver.findElement(Checkbx);
		 cb.click();
		 WebElement ssc      =driver.findElement(Savecontinue0);
		 ssc.click();
	     //Enter Email
	     WebElement emaill   = driver.findElement(Email);
	     emaill.click();
	     emaill.sendKeys("skasi@worksitelabs.com");
	     WebElement conformemail= driver.findElement(Confirmemail);
	     conformemail.click();
		 conformemail.sendKeys("skasi@worksitelabs.com");
		 WebElement sc        = driver.findElement(Savecontinue);
		 sc.click();
	}
   public void selectLocation()
	{
		WebDriverWait wait = new WebDriverWait(driver,99);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Selectalllocation));
				
//				WebElement ele = driver.findElement(Selectalllocation);
//				ele.click();
		List<WebElement> sl  = driver.findElements(Selectalllocation);
		for(int i=0;i<=sl.size()-1;i++) {
		String Locationname=sl.get(i).getText();
		System.out.println(Locationname);
		if(Locationname.equalsIgnoreCase("Phoenix - Blue Sky Airport Parking"))
		{
			sl.get(i).click();
		}
					
	  }
		WebElement sc1       = driver.findElement(Savecontinue);
		sc1.click();		
  }
   public void allMinorMethods()
   {
	   WebElement mcb        =driver.findElement(Majorcheckbox);
		mcb.click();
		WebElement fn1        =driver.findElement(Firstnam1);
		fn1.sendKeys("Sivaji");
		WebElement ln1        =driver.findElement(Lastnam1);
		ln1.sendKeys("Painooru");
		
		waitForElement(Datebirth1);
		WebElement dob        =driver.findElement(Datebirth1);
		//dob.click();
		dob.sendKeys("05/25/1997");
		WebElement passportfield=driver.findElement(Passportcoutry1);
		passportfield.click();
		
		waitForElement(Dropdownpassportcoutry);
		List <WebElement> passportdd=driver.findElements(Dropdownpassportcoutry);
		for(int i=0;i<=passportdd.size()-1;i++)
		{
			String  pascountry=passportdd.get(i).getText();
					System.out.println(pascountry);
			if(pascountry.equals("India"))
			{
				passportdd.get(i).click();
				break;
				
			}
		}
		
		WebElement passports  =driver.findElement(Passport);
		passports.sendKeys("ss#123");
		WebElement micheckbox = driver.findElement(Minorcheckbox);
		micheckbox.click();
		WebElement savecontinue4= driver.findElement(SaveContinue3);
		savecontinue4.click();
		WebElement errormsg = driver.findElement(ErrorMessage);
		String errormessage=errormsg.getText();
		System.out.println("Error Message Showing Like"+"       =      "+errormessage);
		String actual="Required field";
		Assert.assertEquals(actual, errormessage);
		
		
	}
}
	


