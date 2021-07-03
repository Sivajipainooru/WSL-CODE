package WorkSiteLabs.WSL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Information_Page_Errors_BookAppointment extends Base{
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
	By Savecontinue2        = By.xpath("//button[text()='Save & Continue']");
	By ErrorMessage         = By.xpath("(//div[@class='sc-pNWxx gSlGwS'])[1]");
	
	
	public void allInformationMethods()
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
 public void informationPageDetails()
 {
	WebElement mcb        =driver.findElement(Majorcheckbox);
	mcb.click();
	WebElement sc2        =driver.findElement(Savecontinue2);
	sc2.click();
	WebElement 	ermsg     = driver.findElement(ErrorMessage);
	String  errormessagee =ermsg.getText();
	System.out.println("Error Message Showing Like"+"        =        "+errormessagee);
	String actual="Required field";
	Assert.assertEquals(actual, errormessagee);
			}
	

}
