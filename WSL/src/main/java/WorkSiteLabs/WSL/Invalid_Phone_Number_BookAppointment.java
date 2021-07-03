package WorkSiteLabs.WSL;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Invalid_Phone_Number_BookAppointment {
	By ErrorMessage  = By.xpath("//div[text()='Please enter valid US phone number']");
	public void allMethods() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\softsuave\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://worksite-labs---dev.web.app");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement bookappoinmentN      = driver.findElement(By.xpath("//button[text()='Book Appointment Now']"));
		bookappoinmentN.click();
		WebElement phoneNo              = driver.findElement(By.xpath("//input[@name='phone']"));
		phoneNo.sendKeys("949007666");
		WebElement checkBox       = driver.findElement(By.xpath("//input[@name='sendMessagesAboutTestResults']"));
		checkBox.click();
		
		String message="Please enter valid US phone number";
	    Thread.sleep(10000);
		WebElement phonenoErrorMessage  = driver.findElement(ErrorMessage);
		String errormessage=phonenoErrorMessage.getText();
		System.out.println("Error message is"+ "       =         "+ errormessage);
		Assert.assertEquals(message, errormessage);
	}

}
