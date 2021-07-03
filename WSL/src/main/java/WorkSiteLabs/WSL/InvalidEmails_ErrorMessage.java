package WorkSiteLabs.WSL;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class InvalidEmails_ErrorMessage extends Base {
	By BookAppoinmentN      = By.xpath("//button[text()='Book Appointment Now']");
	By PhoneNo              = By.xpath("//input[@name='phone']");
	By Checkbx              = By.xpath("//input[@name='sendMessagesAboutTestResults']");
	By Savecontinue0        = By.xpath("//button[text()='Save & Continue']");
	By Email                = By.xpath("//input[@name='email']");
	By Confirmemail         = By.xpath("//input[@name='confirmEmail']");
	By Savecontinue         = By.xpath("//button[text()='Save & Continue']");
	By ErrorMessage         = By.xpath("//div[@class='sc-pNWxx gSlGwS']");
	
	public void allConfirmationMethods()
	{
	
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
		conformemail.sendKeys("skasi@worksitelab.com");
        WebElement sc        = driver.findElement(Savecontinue);
		sc.click();
		waitForElement(ErrorMessage);
		WebElement errormessage= driver.findElement(ErrorMessage);
		
		String ermsg           =errormessage.getText();
		System.out.println("ERROR MESSAGE IS "+"= "+ermsg);
		String actualmessage="Entered emails do not match";
//		assert.assertEquals(actualmessage,ermsg,"Entered emails do not match");
//		Assert.assertEquals(ermsg,actualmessage);
		Assert.assertEquals(actualmessage, ermsg);
	}

}
