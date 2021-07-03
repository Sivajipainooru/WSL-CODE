package WorkSiteLabs.WSL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Checkin_Admin extends Base{
	By checkiin        =By.xpath("(//div[text()='Appointments Checkin'])[1]");
	By Dateclickk      = By.xpath("//div[@class='ant-picker-input']");
	By Datte           = By.xpath("(//div[text()='30'])[2]");
	By Locationclick    = By.xpath("//div[@class='ant-select ant-select-single ant-select-allow-clear ant-select-show-arrow']");
	By Locationn        = By.xpath("//div[text()='Phoenix - Blue Sky Airport Parking']");
	By confirmatioono   = By.xpath("//input[@id='confirmationId']");
	By Moree            = By.xpath("//button[@class='ant-btn ant-btn-link']");
	By Firstnme         = By.xpath("//input[@id='firstName']");
	By Lastnme          = By.xpath("//input[@id='lastName']");
	By Emaill         = By.xpath("//input[@id='email']");
	By Phoneno         = By.xpath("//input[@id='phone']");
	By Birthdayy         = By.xpath("//input[@id='birthDate']");
	By serch             = By.xpath("//span[text()='Search']");
	
	
	public void allCheckInData()
	{
		waitForElement(checkiin);
		WebElement element = driver.findElement(checkiin);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	    waitForElement(Dateclickk);
		WebElement dateclick = driver.findElement(Dateclickk);
		dateclick.click();
		 waitForElement(Datte);
		WebElement date   = driver.findElement(Datte);
		date.click();
		waitForElement(Locationclick);
		WebElement locationclickk=driver.findElement(Locationclick);
		locationclickk.click();
		WebElement locationn     = driver.findElement(Locationn);
		locationn.click();
		WebElement confirmationumber =driver.findElement(confirmatioono);
		confirmationumber.sendKeys("HAL-PHX-CR-05142021-210093");
	}
	public void more()
	{
		WebElement morre  = driver.findElement(Moree);
		morre.click();
		WebElement firstname  = driver.findElement(Firstnme);
		firstname.sendKeys("Seka");
		WebElement lastname   = driver.findElement(Lastnme);
		lastname.sendKeys("si");
		WebElement email  = driver.findElement(Emaill);
		email.sendKeys("ponni@worksitelabs.co");
		WebElement phonenumber  = driver.findElement(Phoneno);
		phonenumber.sendKeys("7845760422");
		WebElement dobdate   = driver.findElement(Birthdayy);
		dobdate.sendKeys("1996-29-07");
		WebElement searchh  = driver.findElement(serch);
		searchh.click();
	}
	

}
