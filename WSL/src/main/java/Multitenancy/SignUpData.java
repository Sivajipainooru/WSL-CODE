package Multitenancy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpData extends Base{
	By signup              = By.xpath("//div[text()='SIGN UP']");
	By registerEmail       = By.xpath("//input[@name='email']");
	By registerPassword    = By.xpath("//input[@name='password']");
	By registerConfirmPsw  = By.xpath("//input[@name='confirmPassword']");
	By continuebutton      = By.xpath("//button[text()='Continue']");
	By checkbox            = By.xpath("(//input[@type='checkbox'])[1]");
	By majorFName          = By.xpath("//input[@name='firstName']");
	By majorLName          = By.xpath("//input[@name='lastName']");
	By majorDob            = By.xpath("(//input[@placeholder='MM/DD/YYYY'])[1]");
	By minorCheckbox       = By.xpath("//input[@name='hasMinors']");
	By minorFname          = By.xpath("//input[@name='minors.0.firstName']");
	By minorLname          = By.xpath("//input[@name='minors.0.lastName']");
	By minorDob            = By.xpath("(//input[@placeholder='MM/DD/YYYY'])[2]");
	By relationship        = By.xpath("//input[@name='minors.0.relationship']");
	By savecontinue        = By.xpath("/html/body/div/div/div[1]/div/div/form/div[3]/button[2]");
	//By savecontinue        = By.cssSelector("button[class='sc-dmlqKv deQdCw']");
	By phoneno             = By.xpath("//input[@name='phone']");
	By phonenocheckbox     = By.xpath("//input[@type='checkbox']");
	By phonenosavecontinue = By.xpath("//button[text()='Save & Continue']");
	By streetadress        = By.xpath("//input[@name='address.address']");
	By city                = By.xpath("//input[@name='address.city']");
	By stateddown          = By.xpath("//div[@class=' css-tlfecz-indicatorContainer']");
	By allstates           = By.xpath("//div[@class=' css-11unzgr']/*");
	By addressavecontinue = By.xpath("//button[text()='Save & Continue']");
	By zipcode             = By.xpath("//input[@name='address.zipCode']");
	By sexgenderddown        = By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]");
	By sexallgenders       = By.xpath("//div[@tabindex='-1']");
	By raceddown           = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/form/div[2]/div[2]/div[2]/div[1]/div/div[2]/div");
	By racetypes           = By.xpath("//div[@tabindex='-1']");
	By ethnicityddown      = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/form/div[2]/div[3]/div[2]/div[1]/div/div[2]/div");
	By ethnicityall        = By.xpath("//div[@tabindex='-1']");
	By minorsexddown       = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/form/div[4]/div[1]/div[2]/div[1]/div/div[2]/div");
	By minorsexallgenders  = By.xpath("//div[@tabindex='-1']");
	By minorraceddown      = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/form/div[4]/div[2]/div[2]/div[1]/div/div[2]/div");
	By minorraceall        = By.xpath("//div[@tabindex='-1']");
	By minorethnicityddown = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/form/div[4]/div[3]/div[2]/div[1]/div/div[2]/div");
	By minorethnicityall   = By.xpath("//div[@tabindex='-1']");
	By Savecontinue       = By.xpath("//button[text()='Save & Continue']");
	By Createaccount       = By.xpath("//button[text()='Create Account']");
	
	
	
	
	public void signUpDetails()
	{
		WebElement signup1      = driver.findElement(signup);
		signup1.click();
		WebElement enterEmail   = driver.findElement(registerEmail);
		enterEmail.sendKeys("Jessi@worksitelabs.com");
		WebElement enterPassword= driver.findElement(registerPassword);
		enterPassword.sendKeys("Sivaji578@");
		WebElement enterConfirmPsw = driver.findElement(registerConfirmPsw);
		enterConfirmPsw.sendKeys("Sivaji578@");
		WebElement continuee         = driver.findElement(continuebutton);
		continuee.click();
	}
	public void majorMinorDobPage() throws InterruptedException
	{
		waitForElement(checkbox);
		WebElement checkboxA         = driver.findElement(checkbox);
		checkboxA.click();
		WebElement majorfirstname    = driver.findElement(majorFName);
		majorfirstname.sendKeys("Shekhar");
		
		WebElement majorlastname     = driver.findElement(majorLName);
		majorlastname.sendKeys("Kasi");
		Thread.sleep(4000);
		WebElement majordateofbirth  = driver.findElement(majorDob);
		majordateofbirth.click();
		//Thread.sleep(3000);
		majordateofbirth.sendKeys("12/14/2000");
		WebElement minorcheckboxes   = driver.findElement(minorCheckbox);
		minorcheckboxes.click();
		WebElement minorfirstname    = driver.findElement(minorFname);
		minorfirstname.sendKeys("Sivaji");
		WebElement minorlastname     = driver.findElement(minorLname);
		minorlastname.sendKeys("P");
		WebElement minordateofbirth  = driver.findElement(minorDob);
		minordateofbirth.sendKeys("12/10/2014");
		WebElement minorrelationship = driver.findElement(relationship);
		minorrelationship.sendKeys("Brother");
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window, scroll down(0,1000)");
	//	Actions b=new Actions(driver);
		//b.moveToElement(savecontinue).click();
		//b.build();
	//	b.perform();
		Thread.sleep(9000);
		WebElement saveandcontinue   = driver.findElement(savecontinue);
		saveandcontinue.click();
	}
	public void phoneNumberPage()
	{
		WebElement phonenumber       = driver.findElement(phoneno);
		phonenumber.sendKeys("9490076668");
		WebElement phonenumbercheckbox = driver.findElement(phonenocheckbox);
		phonenumbercheckbox.click();
		WebElement phonenumbersavecontinue = driver.findElement(phonenosavecontinue);
		phonenumbersavecontinue.click();
	}
	public void addressPage() throws InterruptedException
	{
		WebElement streetaddress         = driver.findElement(streetadress);
		streetaddress.sendKeys("Ntr street");
		WebElement cityy                 = driver.findElement(city);
		cityy.sendKeys("chennai");
		WebElement statedropdown         = driver.findElement(stateddown);
		statedropdown.click();
		List<WebElement> allstatess       = driver.findElements(allstates);
		for(int i=0;i<allstatess.size()-1;i++)
		{
			String allstatesss=allstatess.get(i).getText();
			if(allstatesss.equalsIgnoreCase("California"))
			{
				allstatess.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		WebElement zipcodee              = driver.findElement(zipcode);
		zipcodee.sendKeys("90016");
		Thread.sleep(1000);
		WebElement savecontinue     = driver.findElement(addressavecontinue);
		savecontinue.click();
		
	}
	public void demographicsPage()
	{
		WebElement sexgender         = driver.findElement(sexgenderddown);
		sexgender.click();
		List<WebElement> sexgendertypes =driver.findElements(sexallgenders);
		for(int i=0;i<=sexgendertypes.size()-1;i++)
		{
			String allgendertypes=sexgendertypes.get(i).getText();
			if(allgendertypes.equalsIgnoreCase("male"))
			{
				sexgendertypes.get(i).click();
				break;
			}
		}
	    waitForElement(raceddown);
		WebElement raceddownbutton   = driver.findElement(raceddown);
		raceddownbutton.click();
		waitForElement(racetypes);
		List<WebElement> allracetypes= driver.findElements(racetypes);
		for(int j=0;j<allracetypes.size();j++)
		{
			String diffracetypes    =allracetypes.get(j).getText();
			if(diffracetypes.equalsIgnoreCase("Asian"))
			{
				allracetypes.get(j).click();
				break;
			}
		}
		waitForElement(ethnicityddown);
		WebElement ethinicitydropdown   = driver.findElement(ethnicityddown);
		ethinicitydropdown.click();
		waitForElement(ethnicityall);
		List<WebElement>  ethnicityallA = driver.findElements(ethnicityall);
		for(int k=0;k<=ethnicityallA.size()-1;k++)
		{
			String  ethinicityOptions =ethnicityallA.get(k).getText();
			if(ethinicityOptions.equalsIgnoreCase("Not Hispanic or Latino"))
			{
				ethnicityallA.get(k).click();
				break;
				
			}
			
		}
		waitForElement(minorsexddown);
		WebElement minorsexddownA     = driver.findElement(minorsexddown);
		minorsexddownA.click();
		List<WebElement> minorsexallgendersA = driver.findElements(minorsexallgenders);
		for(int s=0;s<minorsexallgendersA.size()-1;s++)
		{
			String minorsexallgenderss=minorsexallgendersA.get(s).getText();
			if(minorsexallgenderss.equalsIgnoreCase("Male"))
			{
				minorsexallgendersA.get(s).click();
				break;
				
			}
		}
		waitForElement(minorraceddown);
		WebElement minorraceddownA    = driver.findElement(minorraceddown);
		minorraceddownA.click();
		List<WebElement> minorraceallA= driver.findElements(minorraceall);
		for(int a=0;a<minorraceallA.size()-1;a++)
		{
			String minorraceallelements=minorraceallA.get(a).getText();
			if(minorraceallelements.equalsIgnoreCase("Black or African American"))
			{
				minorraceallA.get(a).click();
				break;
			}
		}
		waitForElement(minorethnicityddown);
		WebElement minorethnicityddownA   = driver.findElement(minorethnicityddown);
		minorethnicityddownA.click();
		List<WebElement> minorethnicityallA     = driver.findElements(minorethnicityall);
		for(int b=0;b<minorethnicityallA.size();b++)
		{
			String minorethinicityallelements =minorethnicityallA.get(b).getText();
			if(minorethinicityallelements.equalsIgnoreCase("Hispanic or Latino"))
			{
				minorethnicityallA.get(b).click();
				break;
			}
			
		}
		WebElement SavecontinueA            = driver.findElement(Savecontinue);
		SavecontinueA.click();
		waitForElement(Createaccount);
		WebElement CreateaccountA           = driver.findElement(Createaccount);
		CreateaccountA.click();
	
		
	
		
		
		{
			
			
		}
		
	}

}
