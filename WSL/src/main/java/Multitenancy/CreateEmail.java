package Multitenancy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CreateEmail extends Base {
	By googlesearch    = By.xpath("//input[@class='gLFyf gsfi']");
	By creategmailact  = By.xpath("//h3[text()='Create a Gmail account - Google Support']");
	By createaccount   = By.xpath("//a[text()='Create an account ']");
	By firstname       = By.xpath("//input[@id='firstName']");
	By lastname        = By.xpath("//input[@id='lastName']");
	By username        = By.xpath("//input[@id='username']");
public void emailTest() throws InterruptedException
{
	WebElement ggsearch=driver.findElement(googlesearch);
	ggsearch.sendKeys("createEmail");
	ggsearch.sendKeys(Keys.ENTER);
	WebElement cgmailact = driver.findElement(creategmailact);
	cgmailact.click();
	WebElement caccount  = driver.findElement(createaccount);
	caccount.click();
	Thread.sleep(5000);
	Set<String> windowHandles = driver. getWindowHandles();
	System.out.println(windowHandles);
	Iterator<String> iterator=windowHandles.iterator();
	String parentcls=iterator.next();
	String childcls=iterator.next();
	driver.switchTo().window(childcls);
	WebElement firstnameA= driver.findElement(firstname);
	firstnameA.sendKeys("sivaji");
	WebElement lastnameA= driver.findElement(lastname);
	lastnameA.sendKeys("raja");
}

}
