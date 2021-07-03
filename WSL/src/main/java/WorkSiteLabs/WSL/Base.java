package WorkSiteLabs.WSL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static WebDriver driver;
	
	public void launchingBrowser()
	{ 
		if(driver==null)
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\softsuave\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://worksite-labs---dev.web.app");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		else
		{
			driver.get("https://worksite-labs---dev.web.app");
		}
	}
	public void launchingAdminBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://worksite-labs---dev.web.app/admin");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.click();
		username.sendKeys("a");
		WebElement password  = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("b");
		WebElement login     = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement menu     = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		menu.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	/* public void verifyNoEmailpasswordErrorMsg()
     {
    	String noEmailErrorMsg = driver.findElement(By.xpath("//div[text()='Required field'])[1]")).getText();
    	 Assert.assertEquals(noEmailErrorMsg,"Required");
    	 String noPasswordErrorMsg = driver.findElement(By.xpath("//div[text()='Required field'])[2]").getText();
    	 Assert.assertEquals(noPasswordErrorMsg,"Required");
     }*/
	
	public void waitForElement(By locator) 
	{
	WebDriverWait wait = new WebDriverWait(driver, 99);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}

}
