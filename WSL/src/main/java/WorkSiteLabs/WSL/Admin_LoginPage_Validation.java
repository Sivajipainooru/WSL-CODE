package WorkSiteLabs.WSL;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Admin_LoginPage_Validation {
	public WebDriver driver;
	public void adminValidation() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://worksite-labs---dev.web.app/admin");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.click();
		username.sendKeys("a");
		WebElement login     = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		String error="Required field";
		Thread.sleep(6000);
		WebElement errormsg =driver.findElement(By.xpath("//div[text()='Required field']"));
		String ermsg=errormsg.getText();
		System.out.println("Error Message is"+"   =     "  +ermsg);
		Assert.assertEquals(error, ermsg);
		driver.quit();
		
	     
	}

}
