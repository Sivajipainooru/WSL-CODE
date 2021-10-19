package Multitenancy;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TooltipValidation extends Base{
	By userName=By.xpath("//input[@id='login_field']");
	By password=By.xpath("//input[@id='password']");
	By submit  =By.xpath("//input[@value='Sign in']");
	By errormessage=By.xpath("//div[@class='container-lg px-2']");
	public void gitData() throws InterruptedException
	{
		WebElement user = driver.findElement(userName);
		user.sendKeys("sivaji2.softsuave.com");
		Thread.sleep(4000);
		WebElement psw  = driver.findElement(password);
		psw.sendKeys("9618994958");
		WebElement signin= driver.findElement(submit);
		signin.click();
		Boolean data=driver.findElement(errormessage).isEnabled();
		if(data==true)
		{
		WebElement text=driver.findElement(errormessage);
		String description=text.getText();
		System.out.println(description);
		String expected="Incorrect username or password.";
		Assert.assertEquals(description, expected);
		
		}
		else
		{
		}
		}
	}


