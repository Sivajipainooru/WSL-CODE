package Multitenancy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Viruj extends Base{
	By signup   = By.xpath("//button[text()='Signup']");
	By patient  = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained patientSgbtn']");
	By ddown    = By.xpath("(//div[@role='button'])[1]");
	By allElements=By.xpath("//li[@role='option']");
	public void data() throws InterruptedException
	{
		waitForElement(signup);
		WebElement sign =driver.findElement(signup);
		sign.click();
		Thread.sleep(2000);
		WebElement patientclick=driver.findElement(patient);
		patientclick.click();
		WebElement dropdown=driver.findElement(ddown);
		dropdown.click();
		Thread.sleep(3000);
		List <WebElement> all=driver.findElements(allElements);
		for(int i=0;i<all.size();i++)
		{
			String text=all.get(i).getText();
			if(text.equalsIgnoreCase("Ms."))
			{
				all.get(i).click();
				break;
			}
			
		}
		
 	}

}
