package WorkSiteLabs.WSL;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Location_Error_Message_BookAppointment extends Base{
	By BookAppoinmentN      = By.xpath("//button[text()='Book Appointment Now']");
	By PhoneNo              = By.xpath("//input[@name='phone']");
	By Checkbx              = By.xpath("//input[@name='sendMessagesAboutTestResults']");
	By Savecontinue0        = By.xpath("//button[text()='Save & Continue']");
	By Email                = By.xpath("//input[@name='email']");
	By Confirmemail         = By.xpath("//input[@name='confirmEmail']");
	By Savecontinue         = By.xpath("//button[text()='Save & Continue']");
	By Savecontinue1        = By.xpath("//button[text()='Save & Continue']");
	By Locationerrmessage   = By.xpath("//div[@class='sc-pNWxx gSlGwS']");
	
	public void allLocationMethods() throws InterruptedException
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
			Thread.sleep(6000);
			WebElement sc1       = driver.findElement(Savecontinue1);
			sc1.click();
			waitForElement(Locationerrmessage);
			WebElement locationerormessage= driver.findElement(Locationerrmessage);
			String message =locationerormessage.getText();
			System.out.println("Error Message is Showing Like"+"         =          "+ message );
			String actualMessage="Please choose location";
			Assert.assertEquals(actualMessage, message);
			
		
	}

}
