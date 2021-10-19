package Multitenancy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignInOldAccount extends Base{
	By signup              = By.xpath("//div[text()='SIGN UP']");
	By registerEmail       = By.xpath("//input[@name='email']");
	By registerPassword    = By.xpath("//input[@name='password']");
	By registerConfirmPsw  = By.xpath("//input[@name='confirmPassword']");
	By continuebutton      = By.xpath("//button[text()='Continue']");
	By duplicatecreadientialsermsg= By.xpath("//div[@class='sc-joieSO iyIxwT']");
	By signin              = By.xpath("//button[text()='Sign In']");
	By clickOn             = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div/div/form/div[7]/a");
	public void signUpDetails()
	{
		WebElement signup1      = driver.findElement(signup);
		signup1.click();
		WebElement enterEmail   = driver.findElement(registerEmail);
		enterEmail.sendKeys("Aasi@worksitelabs.com");
		WebElement enterPassword= driver.findElement(registerPassword);
		enterPassword.sendKeys("Sivaji578@");
		WebElement enterConfirmPsw = driver.findElement(registerConfirmPsw);
		enterConfirmPsw.sendKeys("Sivaji578@");
		WebElement continuee         = driver.findElement(continuebutton);
		continuee.click();
	}
	public void redirectingToSignIn()
	{
		waitForElement(duplicatecreadientialsermsg);
		WebElement duplicatecreadientialsermsgA = driver.findElement(duplicatecreadientialsermsg);
		String errormsg  =duplicatecreadientialsermsgA.getText();
		if(errormsg.equalsIgnoreCase("It looks like the email you're trying to change is already registered."))
		{
			WebElement signinA = driver.findElement(signin);
			signinA.click();
		}
		WebElement clickonA    = driver.findElement(clickOn);
		clickonA.click();
		
	}

}
