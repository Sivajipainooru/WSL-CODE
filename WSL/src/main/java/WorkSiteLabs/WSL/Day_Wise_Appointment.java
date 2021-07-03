package WorkSiteLabs.WSL;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day_Wise_Appointment extends Base{
	By Daywiseapointment =By.xpath("(//div[text()='Day Wise Appointments'])[1]");
	By Datclick          = By.xpath("//div[@class='ant-form-item-control-input']");
	By Datee             = By.xpath("(//div[text()='30'])[2]");
	By Locationclickk    = By.xpath("//div[@class='ant-select-selector']");
	By Locationsall      = By.xpath("//div[@class='rc-virtual-list-holder-inner']/div");
	By Confirmationno    = By.xpath("//input[@id='confirmationId']");
	By Moree            = By.xpath("//button[@class='ant-btn ant-btn-link']");
	By Firstnme         = By.xpath("//input[@id='firstName']");
	By Lastnme          = By.xpath("//input[@id='lastName']");
	By Emaill         = By.xpath("//input[@id='email']");
	By Phoneno         = By.xpath("//input[@id='phone']");
	By dob               = By.xpath("//div[@class='ant-picker-input']");
	By Birthdayy         = By.xpath("//input[@id='birthDate']");
	By serch             = By.xpath("//span[text()='Search']");
	
	public void alldaywisedata() throws InterruptedException
	{
		waitForElement(Daywiseapointment);
		WebElement daywiseappointment   = driver.findElement(Daywiseapointment);
		Actions a                       = new Actions(driver);
		a.moveToElement(daywiseappointment).click().perform();
		waitForElement(Datclick);
		WebElement dateclick            = driver.findElement(Datclick);
		dateclick.click();
		waitForElement(Datee);
		WebElement date                 = driver.findElement(Datee);
//		Actions act= new Actions(driver);
//		act.moveToElement(date).click().perform();
		date.click();
		
		
		
		
		//WebElement LocationTexBox =driver.findElement(By.id("location"));
		 //LocationTexBox.click();
//		waitForElement(Locationclickk);
		Thread.sleep(5000);
		WebElement locationclick        = driver.findElement(Locationclickk);
		locationclick.click();
		waitForElement(Locationsall);
		List <WebElement> alllocations  = driver.findElements(Locationsall);
		for(int i=0;i<alllocations.size();i++)
		{
			String locationsall=alllocations.get(i).getText();
			System.out.println(locationsall);
			if(locationsall.equalsIgnoreCase("Phoenix - Blue Sky Airport Parking"))
			{
				alllocations.get(i).click();
				break;
			}
		}
		
		WebElement confirmationnumber   = driver.findElement(Confirmationno);
		confirmationnumber.sendKeys("HAL-PHX-CR-05142021-964222");
		
	}
	public void moreDetails()
	{
		WebElement morre  = driver.findElement(Moree);
		morre.click();
		WebElement firstname  = driver.findElement(Firstnme);
		firstname.sendKeys("kaja");
		WebElement lastname   = driver.findElement(Lastnme);
		lastname.sendKeys("k");
		WebElement email  = driver.findElement(Emaill);
		email.sendKeys("skasi@worksitelabs.com	");
		WebElement phonenumber  = driver.findElement(Phoneno);
		phonenumber.sendKeys("9490076668");
		 waitForElement(Birthdayy);
			WebElement dobdate1   = driver.findElement(dob);
			dobdate1.click();
        waitForElement(Birthdayy);
		WebElement dobdate   = driver.findElement(Birthdayy);
		dobdate.sendKeys("2000/04/05");
		WebElement searchh  = driver.findElement(serch);
		searchh.click();
	}
	
	

}
