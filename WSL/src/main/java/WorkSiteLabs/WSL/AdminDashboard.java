package WorkSiteLabs.WSL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AdminDashboard extends Base {
	By EnterName       = By.xpath("//input[@class='sc-gXfWUo blvPOS']");
	By Pasword         = By.xpath("//input[@type='password']");
	By logen           = By.xpath("//button[@type='submit']");
	By Menuu           = By.xpath("(//button[@type='button'])[1]");
	By Dashbord        = By.xpath("(//div[text()='Dashboard'])[1]");
public void adminLogin()
{
	WebElement dashboard = driver.findElement(Dashbord);
	Actions a = new Actions(driver);
	a.moveToElement(dashboard).click().perform();
	}
}

