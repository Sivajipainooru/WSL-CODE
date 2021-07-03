package WorkSiteLabs.WSL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keymetrics_Admin extends Base {
	By keymetrix      = By.xpath("html/body/div[2]/div[3]/div[2]/ul/a[2]/div/div");//("(//span[@class='MuiTouchRipple-root'])[13]");//("//div[text()='Key Metrics']");
	By calenderclick  = By.xpath("//div[@class='ant-picker-input']");
	By Fromdte        = By.xpath("(//div[text()='26'])[2]");
	By Todat          = By.xpath("//div[text()='26']");
	By Locationclick  = By.xpath("//div[@class='ant-select-selector']");
	By Locatioon      = By.xpath("//div[@class='ant-select-item-option-content']");
	By Timeslotclick  = By.xpath("(//div[@class='ant-select-selector'])[2]");
	By Timeslats      = By.xpath("//div[@class='ant-select-item ant-select-item-option']");
	By Resultclicks   = By.xpath("(//div[@class='ant-select-selector'])[3]");
	By Resultstatus   = By.xpath("//div[@class='rc-virtual-list-holder-inner']/div");
	By Serch          = By.xpath("//*[@id=\"search\"]/button/span");
	
	public void allKeyMetricsMethods()
	{
		
		
		//driver.switchTo().frame(2);
		waitForElement(keymetrix);
		WebElement keymetricssymbol=driver.findElement(keymetrix);
		//keymetricssymbol.click();
		Actions a=new Actions(driver);
		a.moveToElement(keymetricssymbol).click().build().perform();
		WebElement calendar       = driver.findElement(calenderclick);
		calendar.click();
		waitForElement(Fromdte);
		WebElement fromdate        = driver.findElement(Fromdte);
		fromdate.click();
		//WebElement todate          = driver.findElement(Todat);
		//todate.click();
		//waitForElement(Locationclick);
		WebElement locclick        = driver.findElement(Locationclick);
		locclick.click();
		List <WebElement> locations = driver.findElements(Locatioon);
		for(int i=0;i<locations.size()-1;i++)
		{
			String alllocations=locations.get(i).getText();
			System.out.println(alllocations);
			if(alllocations.equalsIgnoreCase("Phoenix - Blue Sky Airport Parking"))
			{
				locations.get(i).click();
			}
			
		}
		WebElement timeslotsclick      = driver.findElement(Timeslotclick);
		timeslotsclick.click();
		waitForElement(Timeslats);
		List <WebElement> timeslots    = driver.findElements(Timeslats);
		for(int i=0;i<timeslots.size()-1;i++)
		{
			String slottimings   = timeslots.get(i).getText();
			System.out.println(slottimings);
			if(slottimings.equalsIgnoreCase("8:00 AM - 8:30 AM"))
			{
				timeslots.get(i).click();
			}
			
		}
		
		waitForElement(Resultclicks);
		WebElement resultclick = driver.findElement(Resultclicks);
		resultclick.click();
		
		List <WebElement> result = driver.findElements(Resultstatus);
		for(int i=0;i<result.size();i++)
		{
			String reportresult = result.get(i).getText();
			System.out.println(reportresult);
			if(reportresult.equalsIgnoreCase("Not Detected"))
			{
				result.get(i).click();
			}
		}
		WebElement search = driver.findElement(Serch);
		search.click();
 		
	}

}
