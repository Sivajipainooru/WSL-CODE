package WorkSiteLabs.WSL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResultsandSlotOccupancy extends Base{
		By Results      = By.xpath("(//div[text()='Results'])[1]");
		By Todayy       = By.xpath("//span[text()='Today']");
		By Pastweekk    = By.xpath("//span[text()='Past Week']");
		By Menusymbol   = By.xpath("(//span[@class='MuiIconButton-label'])[1]");
		By SlotOccupancy = By.xpath("(//div[text()='Slot Occupancy'])[1]");
		By Slotdateclick = By.xpath("//input[@placeholder='Select date']");
		By Date          = By.xpath("(//div[text()='26'])[2]");
		By serch         = By.xpath("//span[text()='Search']");
	public void allResults() throws InterruptedException
	{
		waitForElement(Results);
		WebElement result   = driver.findElement(Results);
		Actions a           = new Actions(driver);
		a.moveToElement(result).click().perform();
		WebElement today     = driver.findElement(Todayy);
		today.click();
		waitForElement(Pastweekk);
		WebElement pastweek  = driver.findElement(Pastweekk);
		pastweek.click();
		Thread.sleep(5000);
		waitForElement(Menusymbol);
		WebElement allmenusymbol= driver.findElement(Menusymbol);
		allmenusymbol.click();
	}
   public void allSlotOccupancy() throws InterruptedException
   {
	   WebElement slotoccupancies   = driver.findElement(SlotOccupancy);
		Actions a           = new Actions(driver);
		a.moveToElement(slotoccupancies).click().perform();
		Thread.sleep(3000);
		waitForElement(Slotdateclick);
		WebElement slotclick     = driver.findElement(Slotdateclick);
		slotclick.click();
		waitForElement(Date);
		WebElement datee     = driver.findElement(Date);
		datee.click();
		WebElement search     = driver.findElement(serch);
		search.click();
   }
}
