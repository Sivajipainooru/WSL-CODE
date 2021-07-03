package WorkSiteLabs.WSL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DOB_Minor_Validation_BookAppointment extends Base{
	By BookAppoinmentN      = By.xpath("//button[text()='Book Appointment Now']");
	By PhoneNo              = By.xpath("//input[@name='phone']");
	By Checkbx              = By.xpath("//input[@name='sendMessagesAboutTestResults']");
	By Savecontinue0        = By.xpath("//button[text()='Save & Continue']");
	By Email                = By.xpath("//input[@name='email']");
	By Confirmemail         = By.xpath("//input[@name='confirmEmail']");
	By Savecontinue         = By.xpath("//button[text()='Save & Continue']");
	By Selectalllocation    = By.xpath("html/body/div/div/div/div/div/form/div/button/div[1]/div");
	//By Selectalllocation    = By.xpath("(//div[@class='sc-jgPznn eEthnu'])[9]");
	By Majorcheckbox        = By.xpath("//input[@name='haCustomer']");
	By Firstnam             = By.xpath("//input[@name='firstName']");
	By Lastnam              = By.xpath("//input[@name='lastName']");
	By Datebirth            = By.xpath("//input[@placeholder='MM/DD/YYYY']");
    By Passportcoutry       = By.xpath("//div[@class=' css-14e1rle']");
	By Dropdownpassportcoutry= By.xpath("//div[@class=' css-26l3qy-menu']/div/div");
	By Passport             = By.xpath("//input[@name='passportNo']");
	By Minorcheckbox        = By.xpath("//input[@name='hasMinors']");
	By MFirstnam            = By.xpath("//input[@name='minors.0.firstName']");
	By MLastnam             = By.xpath("//input[@name='minors.0.lastName']");
	By Datebirth2           = By.xpath("(//input[@placeholder='MM/DD/YYYY'])[2]");
	By Relatship            = By.xpath("//input[@name='minors.0.relationship']");
	By Savecontinue4        = By.xpath("//button[text()='Save & Continue']");
	By ErrorMsg             = By.xpath("//div[@class='sc-pNWxx gSlGwS']");
	
	public void allDobValues()
	{
		waitForElement(BookAppoinmentN);
		 WebElement ban      = driver.findElement(BookAppoinmentN);
		 ban.click();
	      //Click phone number option after enter the phone number
        WebElement pn       = driver.findElement(PhoneNo);
		 pn.sendKeys("9490076668");
		//Select Check box
	     WebElement cb       = driver.findElement(Checkbx);
		 cb.click();
		 WebElement ssc      =driver.findElement(Savecontinue0);
		 ssc.click();
	     //Enter Email
	     WebElement emaill   = driver.findElement(Email);
	     emaill.click();
	     emaill.sendKeys("skasi@worksitelabs.com");
	     WebElement conformemail= driver.findElement(Confirmemail);
	     conformemail.click();
		 conformemail.sendKeys("skasi@worksitelabs.com");
		 WebElement sc        = driver.findElement(Savecontinue);
		 sc.click();
	}
  public void selectLocation()
	{
		WebDriverWait wait = new WebDriverWait(driver,99);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Selectalllocation));
				
//				WebElement ele = driver.findElement(Selectalllocation);
//				ele.click();
		List<WebElement> sl  = driver.findElements(Selectalllocation);
		for(int i=0;i<=sl.size()-1;i++) {
		String Locationname=sl.get(i).getText();
		System.out.println(Locationname);
		if(Locationname.equalsIgnoreCase("Phoenix - Blue Sky Airport Parking"))
		{
			sl.get(i).click();
		}
					
	  }
		WebElement sc1       = driver.findElement(Savecontinue);
		sc1.click();		
 }
public void dobPageDetails()
{
	WebElement mcb        =driver.findElement(Majorcheckbox);
	mcb.click();
	WebElement firstname  = driver.findElement(Firstnam);
	firstname.sendKeys("Sivaji");
	WebElement lastname   = driver.findElement(Lastnam);
	lastname.sendKeys("Painuru");
	waitForElement(Datebirth);
	WebElement dob        = driver.findElement(Datebirth);
	dob.sendKeys("04/20/1997");
	
	WebElement passportfield=driver.findElement(Passportcoutry);
	passportfield.click();
	
	waitForElement(Dropdownpassportcoutry);
	List <WebElement> passportdd=driver.findElements(Dropdownpassportcoutry);
	for(int i=0;i<=passportdd.size()-1;i++)
	{
		String  pascountry=passportdd.get(i).getText();
				System.out.println(pascountry);
		if(pascountry.equals("India"))
		{
			passportdd.get(i).click();
			break;
			
		}
	}
	
	WebElement passports  =driver.findElement(Passport);
	passports.sendKeys("ss#123");
	
	WebElement micb        =driver.findElement(Minorcheckbox);
	micb.click();
	WebElement fn2         =driver.findElement(MFirstnam);
	fn2.sendKeys("Shekhar");
	WebElement ln2         =driver.findElement(MLastnam);
	ln2.sendKeys("Kasi");
	
	waitForElement(Datebirth2);
	WebElement dob1        =driver.findElement(Datebirth2);
	//dob1.click();
	dob1.sendKeys("05/05/2021");
	WebElement relationship=driver.findElement(Relatship);
	relationship.sendKeys("Friend");
	WebElement savecontinue5=driver.findElement(Savecontinue4);
	savecontinue5.click();
	WebElement emsg   = driver.findElement(ErrorMsg);
	String expected =emsg.getText();
	String actualmsg="Children under 5 years of age from the date of the appointment do not need a Covid test.";
	System.out.println("Entered Below Dob It is Showing Like"+"      =      "+expected);
	Assert.assertEquals(actualmsg, expected);
	
	
	

}
}
