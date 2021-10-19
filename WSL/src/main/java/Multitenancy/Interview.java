package Multitenancy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Interview extends Base {
	By search = By.xpath("//input[@class='gLFyf gsfi']");
	By data   = By.xpath("//span[@class='qv3Wpe']");
	By calculator=By.xpath("(//div[@class='ULSxyf'])[1]");
	By count     =By.xpath("//span[@class='vUGUtc']");
	public void test()
	{
		WebElement searchA=driver.findElement(search);
		searchA.sendKeys("2+2");
		searchA.sendKeys(Keys.ENTER);
		Boolean cal=driver.findElement(calculator).isEnabled();
		if(cal==true)
		{
			System.out.println("calculator is appearing");
		}
		else
		{
			System.out.println("calculator is not visible");
		}
		String text1=driver.findElement(count).getText();
		System.out.println(text1);
		if(text1.equals("  2 + 2 =  "))
		{
			String matter="  2 + 2 =  ";
			System.out.println("Output text is"+text1);
			Assert.assertEquals(matter, text1);
			
		}
		String text=driver.findElement(data).getText();
		if(text.equals("4"))
		{
			String matter="4";
			System.out.println("Output text is"+text);
			Assert.assertEquals(matter, text);
			
		}
		else
		{
			System.out.println("Your expecting data is not showing");
		}
	}

}
