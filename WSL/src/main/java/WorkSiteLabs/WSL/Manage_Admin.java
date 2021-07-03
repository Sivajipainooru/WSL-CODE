package WorkSiteLabs.WSL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Manage_Admin extends Base {
	By managg        = By.xpath("(//div[text()='Manage'])[2]");
	By emaill        = By.xpath("//input[@name='email']");
	By mobileno      = By.xpath("//input[@name='phone']");
	//By loginn        = By.xpath("//button[text()='Login']");
	By confirmapp    = By.xpath("//button[text()='Verify Identity']");
	By extendapoinment=By.xpath("(//div[@class='sc-czEUsQ fjyeyK'])[1]");
	By reschedul     = By.xpath("//button[@class='sc-fujyUd cVgsMG']");
	By Flightdeparture      = By.xpath("//input[@class='sc-gXfWUo dfGyKR']");
	By Slots                = By.xpath("//button[@class='sc-TtZHJ cZREMU']");
	By Confirmreschdule     = By.xpath("//button[text()='Confirm Reschedule']");
	
	public void allManageOptions() throws InterruptedException
	{
		WebElement manage    = driver.findElement(managg);
		manage.click();
		WebElement email     = driver.findElement(emaill);
		email.click();
		email.sendKeys("skasi@worksitelabs.com");
		//WebElement login     = driver.findElement(loginn);
		//login.click();
		WebElement confirmverify =driver.findElement(confirmapp);
		confirmverify.click();
		waitForElement(extendapoinment);
		WebElement extendappointmentdata = driver.findElement(extendapoinment);
		extendappointmentdata.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,2000)", "");
		
		WebElement reschedule    = driver.findElement(reschedul);
		
		Actions act = new Actions(driver);
		act.moveToElement(reschedule).build().perform();
		reschedule.click();
		
		
		WebElement departure=driver.findElement(Flightdeparture);
		departure.sendKeys("05/25/2021 01:30 PM");
		//WebElement datee=driver.findElement(Date);
		//datee.click();
		//WebElement timee=driver.findElement(Time);
		//timee.click();
		
		Thread.sleep(3000);
		List <WebElement> slot=driver.findElements(Slots);
		for(int i=0;i<=slot.size()-1;i++)
		{
			if(slot.get(i).isEnabled())
			{
				slot.get(i).click();
				break;
			}
			else
			{
				System.out.println(i+"Slots is not available");
			}
		}
		WebElement confirmationschedule  = driver.findElement(Confirmreschdule);
		Actions a=new Actions(driver);
		act.moveToElement(confirmationschedule).click().perform();
	}
	

}
