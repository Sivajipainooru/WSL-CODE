package Multitenancy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookAppointment extends Base {
	By BookAppointment     = By.xpath("//span[@class='booking-txt']");
	By BookNow              = By.xpath("(//button[text()='BOOK NOW'])[1]");
	By Dropdown1            = By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]");
	By Travellingtypes      = By.xpath("//div[@tabindex='-1']");
	By Dropdown2            = By.xpath("(//div[@class=' css-74iutf-container'])[2]");
	By DestinationCountries = By.xpath("//div[@tabindex='-1']");
	By Dropdown3            = By.xpath("(//div[@class=' css-74iutf-container'])[3]");
	By FlyingOn             = By.xpath("//div[@tabindex='-1']");
	By confirmCheckBox      = By.xpath("//input[@name='commitToConfirm']");
	By SaveContinue        = By.xpath("/html/body/div/div/div[1]/div/div/p[2]/form/div[5]/button[2]");
	//By Selectalllocation    = By.xpath("//button[@type='button']");
	//By AllLocations        = By.xpath("html/body/div/div/div/div/div/form/div/button/div[1]/div");
	By austinlcn           = By.xpath("(//button[@class='sc-Qpmqz euxNcJ'])[2]");
	By SaveContinue9      = By.xpath("//button[text()='Save & Continue']");
	By AddMinor            = By.xpath("/html/body/div/div/div[1]/div/div/div/div[2]/form/form/button");
	By minFirstname        = By.xpath("//input[@name='minors.0.firstName']");
	By minMiddlename       = By.xpath("//input[@name='minors.0.middleName']");
	By minLastname         = By.xpath("//input[@name='minors.0.lastName']");
	By minorDob            = By.xpath("//input[@placeholder='MM/DD/YYYY']");
	By relationship        = By.xpath("//input[@name='minors.0.relationship']");
	By passportCountryDD   = By.xpath(" //div[@class=' css-tlfecz-indicatorContainer']");
	By passportallcountryes= By.xpath("//div[@tabindex='-1']");
	By passport            = By.xpath("//input[@name='minors.0.passportNo']");
	By addMinor            = By.xpath("//button[text()='Add Minors']");
	By childrenCheckbox    = By.xpath("(//input[@class='sc-evBdYF fZGAsR'])[3]");
	By saveandcontinue1    = By.xpath("//button[text()='Save & Continue']");
	By RapidTest           = By.xpath("(//div[@class='sc-leCVjZ hgHaGX'])[1]");
	By Ok                  = By.xpath("//button[text()='OK']");
	By Departuredatetime   = By.xpath("//input[@class='sc-jNnnWF kntsEq']");
	By Slots               = By.xpath("//button[@class='sc-iNiQeE rlEfV']");
	By SaveContinue2       = By.xpath("//button[text()='Save & Continue']");
	By no                  = By.xpath("//button[text()='No']");

	
public void travellingTypeByAir() throws InterruptedException
{
	waitForElement(BookAppointment);
	WebElement book = driver.findElement(BookAppointment);
	Actions a=new Actions(driver);
	a.moveToElement(book).click().build().perform();
	Thread.sleep(3000);
	
	//WebElement BookAppointmentA  = driver.findElement(BookAppointment);
	//BookAppointmentA.click();
	WebElement BookNowA          = driver.findElement(BookNow);
	BookNowA.click();
	Thread.sleep(2000);
	WebElement Dropdown1A        = driver.findElement(Dropdown1);
	Dropdown1A.click();
	List <WebElement> TravellingtypesA = driver.findElements(Travellingtypes);
	for(int i=0;i<TravellingtypesA.size();i++)
	{
		String TravellingtypesB =TravellingtypesA.get(i).getText();
		if(TravellingtypesB.equalsIgnoreCase("Internationally"))
		{
			TravellingtypesA.get(i).click();
			break;
		}
	}
	Thread.sleep(7000);
//	waitForElement(Dropdown2);
	WebElement Dropdown2A = driver.findElement(Dropdown2);
	System.out.println("SIVAJI");
	Dropdown2A.click();
	waitForElement(DestinationCountries);
	List<WebElement>  DestinationCountriesA = driver.findElements(DestinationCountries);
	for(int i=0;i<DestinationCountriesA.size();i++)
	{
		String DestinationCountriesB =DestinationCountriesA.get(i).getText();
		if(DestinationCountriesB.equalsIgnoreCase("Belgium"))
		{
			DestinationCountriesA.get(i).click();
			break;
		}
		
	}
	waitForElement(Dropdown3);
	WebElement Dropdown3A       = driver.findElement(Dropdown3);
	Dropdown3A.click();
	List<WebElement>  FlyingOnA = driver.findElements(FlyingOn);
	for(int i=0;i<FlyingOnA.size();i++)
	{
		String FlyingOnB =FlyingOnA.get(i).getText();
		if(FlyingOnB.equalsIgnoreCase("WestJet"))
		{
			FlyingOnA.get(i).click();
			break;
		}
		
	}
	waitForElement(confirmCheckBox);
	WebElement confirmCheckBoxA      = driver.findElement(confirmCheckBox);
	confirmCheckBoxA.click();
	waitForElement(SaveContinue);
	WebElement SaveContinueA         = driver.findElement(SaveContinue);
	SaveContinueA.click();
    WebElement austin        = driver.findElement(austinlcn);
	austin.click();
	WebElement SaveContinueB         = driver.findElement(SaveContinue9);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window, scrollBy(0,1400)");
	Thread.sleep(5000);
	//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",SaveContinue9);
	SaveContinueB.click();
	//waitForElement(SaveContinue9);
	/*
	waitForElement(AddMinor);
	WebElement AddMinorA             = driver.findElement(AddMinor);
	JavascriptExecutor jd=(JavascriptExecutor)driver;
	jd.executeScript("window, scrollBy(0,900)");
	Thread.sleep(3000);
	AddMinorA.click();
	WebElement minFirstnameA         = driver.findElement(minFirstname);
	minFirstnameA.sendKeys("raja");
	WebElement minMiddlenameA         = driver.findElement(minMiddlename);
	minMiddlenameA.sendKeys("v");
	WebElement minLastnameA         = driver.findElement(minLastname);
	minLastnameA.sendKeys("chenchu");
	WebElement minorDobA         = driver.findElement(minorDob);
	minorDobA.sendKeys("12-12-2004");
	 
	WebElement relationshipA         = driver.findElement(relationship);
	relationshipA.sendKeys("nephew");
	 JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", relationshipA);
	Thread.sleep(4000);
	WebElement passportCountryDDA         = driver.findElement(passportCountryDD);
	passportCountryDDA.click();
	//passportCountryDDA.click();
	List<WebElement>  passportallcountryesA = driver.findElements(passportallcountryes);
	for(int i=0;i<passportallcountryesA.size();i++)
	{
		String passportallcountryesB = passportallcountryesA.get(i).getText();
		if(passportallcountryesB.equalsIgnoreCase("Algeria"))
		{
			passportallcountryesA.get(i).click();
			break;
		}
	}
	WebElement passportA    = driver.findElement(passport);
	passportA.sendKeys("ss#123");
	WebElement addMinorA    = driver.findElement(addMinor);
	addMinorA.click();*/
	Thread.sleep(4000);
	WebElement majorcheckbox= driver.findElement(childrenCheckbox);
	Actions b=new Actions(driver);
	b.moveToElement(majorcheckbox).click().build().perform();
	//JavascriptExecutor jk=(JavascriptExecutor)driver;
	// jk.executeScript("arguments[0].scrollIntoView();", majorcheckbox);
	 
	//majorcheckbox.click();
	JavascriptExecutor jn=(JavascriptExecutor)driver;
	jn.executeScript("window, scrollBy(0,1500)");
	waitForElement(saveandcontinue1);
	WebElement SaveContinueD      = driver.findElement(saveandcontinue1);
	Actions c=new Actions(driver);
	Thread.sleep(3000);
	c.moveToElement(SaveContinueD).click().build().perform();
	Thread.sleep(3000);
	Boolean rapidtest=driver.findElement(RapidTest).isSelected();
	if(rapidtest==true)
	{
	}
	else
	{
		Thread.sleep(4000);
		WebElement rapidtestt=driver.findElement(RapidTest);
		rapidtestt.click();
	}
	WebElement okay=driver.findElement(Ok);
	okay.click();
	WebElement departuredatetimes=driver.findElement(Departuredatetime);
	departuredatetimes.sendKeys("15/10/2021");
	
	
	
	
	//SaveContinueC.click();
	

			
			
 }
}
