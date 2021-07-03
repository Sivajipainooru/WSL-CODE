package WorkSiteLabs.WSL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DOB_Validation_Major_Bookappointment extends Base{
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
	By Firstnam             = By.xpath("//input[@name='firstName']");
	By Lastnam              = By.xpath("//input[@name='lastName']");
	By Datebirth            = By.xpath("//input[@placeholder='MM/DD/YYYY']");
	By Savecontinue4        = By.xpath("//button[text()='Save & Continue']");
	By ErroMessage          = By.xpath("//div[@class='sc-pNWxx gSlGwS']");
	
	public void allDobValues()
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
public void dobPageDetails()
{
	WebElement mcb        =driver.findElement(Majorcheckbox);
	mcb.click();
	WebElement firstname  = driver.findElement(Firstnam);
	firstname.sendKeys("Sivaji");
	WebElement lastname   = driver.findElement(Lastnam);
	lastname.sendKeys("Painuru");
	waitForElement(Datebirth);
	WebElement dob        = driver.findElement(Datebirth);
	dob.sendKeys("04/20/2021");
	WebElement savecontinue5=driver.findElement(Savecontinue4);
	savecontinue5.click();
	waitForElement(ErroMessage);
	WebElement emsg        = driver.findElement(ErroMessage);
	String expectedmsg  =emsg.getText();
	System.out.println("We Entered Below 18 years DOB It Should be like"+"        =        "+expectedmsg);
	String actuallmsg   ="You must be 18 years old or above";
	Assert.assertEquals(actuallmsg, expectedmsg);
	
	}

}
