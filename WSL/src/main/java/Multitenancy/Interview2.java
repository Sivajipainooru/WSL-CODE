package Multitenancy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Interview2 extends Base {
	By search = By.xpath("//input[@class='gLFyf gsfi']");
	By word     = By.xpath("(//div[@class='wM6W7d'])[1]");
	public void test3()
	{
		WebElement srch = driver.findElement(search);
		srch.sendKeys("mispelled");
		srch.sendKeys(Keys.ENTER);
		Boolean textt=driver.findElement(word).isEnabled();
		if(textt==true)
		{
		  String txt="misplled";
		  Assert.assertEquals(txt,textt);
		}
		else
		{
			System.out.println("The words are not matching");
		}
	}

}
