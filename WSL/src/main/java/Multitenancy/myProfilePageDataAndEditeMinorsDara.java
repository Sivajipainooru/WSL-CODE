package Multitenancy;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class myProfilePageDataAndEditeMinorsDara extends Base {

	By editesymbol     =By.xpath("//div[@class='sc-fyMqFV dastaB']");
	By dobedite        =By.xpath("(//div[@class='sc-hlsGSa fTVwdZ'])[1]");
    By phonenoedite    =By.xpath("(//div[@class='sc-hlsGSa fTVwdZ'])[2]");
    By homeaddressedite=By.xpath("(//div[@class='sc-hlsGSa fTVwdZ'])[3]");
    By editefirstname  =By.xpath("/html/body/div[2]/div/div/div/div/form/div[1]/div[1]/div[2]/input");
    By editemiddlename =By.xpath("/html/body/div[2]/div/div/div/div/form/div[1]/div[2]/div[2]/input");
    By editelastname   =By.xpath("/html/body/div[2]/div/div/div/div/form/div[1]/div[3]/div[2]/input");
    By confirm         =By.xpath("//button[text()='Confirm']");
    By editeBTN        =By.xpath("//button[text()='Edit']");
    By minorFirstName  =By.xpath("//input[@name='minors.0.firstName']");
    By minorMiddleName =By.xpath("//input[@name='minors.0.middleName']");
    By minorLastName   =By.xpath("//input[@name='minors.0.lastName']");
    By dob             =By.xpath("//input[@placeholder='MM/DD/YYYY']");
    By relationship    =By.xpath("//input[@name='minors.0.relationship']");
   // By passport        =By.xpath("//input[@name='minors.0.passportNo']");
    By minoreditconfirm=By.xpath("//button[text()='Confirm']");
    By addInsurance1    =By.xpath("//div[text()='Insurance']");
     By addInsurance    =By.xpath("(//div[@class='sc-gkRonE cjObsi'])[4]");
    By addNewInsurance =By.xpath("//button[@class='sc-cUBkJM bfoWqw']");
    By payerListDD     =By.xpath("//div[@class=' css-tlfecz-indicatorContainer']");
    By allSelect       =By.xpath("//div[@tabindex='-1']");
    By id              =By.xpath("//input[@name='insurance.insuranceId']");
    By group           =By.xpath("//input[@name='insurance.group']");
    By subscriberfirstname=By.xpath("//input[@name='insurance.subscriberFirstName']");
    By subscriberlastname= By.xpath("//input[@name='insurance.subscriberLastName']");
    By uploadpicInsurance= By.xpath("//div[@class='sc-chbAZy dUFBfM']");
    By uploadurcomputer  = By.xpath("//div[@class='sc-gOjTIK hXBZJq']");
    By insuranceCardFront= By.xpath("(//div[@class='sc-kudgIq dKtlag'])[1]");
    By choosePhoto       = By.xpath("//input[@id='new-front-file']");
    By add               = By.xpath("(//button[text()='Add'])[2]");
    By insuranceCardBack = By.xpath("//div[@class='sc-kudgIq dKtlag']");
    By choosePhotoForBack= By.xpath("//input[@id='new-back-file']");
    By addB              = By.xpath("(//button[text()='Add'])[2]");
    By addButton         = By.xpath("(//button[text()='Add'])[2]");
    
   

public void editeMethods(String SHEKHAR,String shetty,String Kasi) throws InterruptedException {
	  waitForElement(editesymbol);
	  WebElement profileedite= driver.findElement(editesymbol);
	  profileedite.click();
	  WebElement firstnameedite =driver.findElement(editefirstname);
	 firstnameedite.clear();
	  firstnameedite.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
	  firstnameedite.sendKeys("SHEKHAR");
	  WebElement middlenameedite =driver.findElement(editemiddlename);
	  middlenameedite.clear();
	  middlenameedite.sendKeys("shetty");
	  WebElement lastnameedite =driver.findElement(editelastname);
	  lastnameedite.clear();
	  lastnameedite.sendKeys("KASI");
	  WebElement submit        = driver.findElement(confirm);
	  submit.click();
	 
}

public void editeMinorPersonData() {
	waitForElement(editeBTN);
	WebElement editebutton    = driver.findElement(editeBTN);
	editebutton.click();
	WebElement minorfirstnameA = driver.findElement(minorFirstName);
	minorfirstnameA.sendKeys("Ramarao");
	WebElement minormiddlenameA = driver.findElement(minorMiddleName);
	minormiddlenameA.sendKeys("tharaka");
	WebElement minorlastnameA = driver.findElement(minorLastName);
	minorlastnameA.sendKeys("Nandhamuri");
	WebElement dobA = driver.findElement(dob);
	dobA.sendKeys("14-12-1997");
	WebElement relationshipA = driver.findElement(relationship);
	relationshipA.sendKeys("Son");
//	waitForElement(passport);
//	WebElement passportA = driver.findElement(passport);
	//passportA.sendKeys("ss#123");
	WebElement minorediteconfirmA = driver.findElement(minoreditconfirm);
	minorediteconfirmA.click();
	//Actions a  =new Actions(driver);
	//a.k(Keys.ENTER).build().perform();
	
}
public void insurance()
{
	//Actions a   =new Actions(driver);
	//a.click(addInsurance).build().perform();
	//driver.switchTo().defaultContent();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 1000)");
	waitForElement(addInsurance);
	WebElement addinsuranceA       =driver.findElement(addInsurance);
	addinsuranceA.click();
	WebElement addinsurance1A      =driver.findElement(addInsurance1);
	addinsurance1A.click();
	waitForElement(addNewInsurance);
	WebElement addnewinsuranceA    =driver.findElement(addNewInsurance);
	addnewinsuranceA.click();
	WebElement payerListDDA        =driver.findElement(payerListDD);
	payerListDDA.click();
	List<WebElement>  allselectlocations= driver.findElements(allSelect);
	for(int i=0;i<allselectlocations.size();i++)
	{
		String locations=allselectlocations.get(i).getText();
		System.out.println(locations);
		if(locations.equalsIgnoreCase("Humana"))
		{
			allselectlocations.get(i).click();
			break;
		
		}
			
		
	}
	//driver.switchTo().frame(1);
	waitForElement(id);
	WebElement idA                 =driver.findElement(id);
	idA.sendKeys("SNGROUP OF IDS");
	WebElement groupsA             =driver.findElement(group);
	groupsA.sendKeys("Sivaji Group Of Industries");
	WebElement subscriberfirstnameA=driver.findElement(subscriberfirstname);
	subscriberfirstnameA.sendKeys("Sivaji");
	WebElement subscriberlastnameA =driver.findElement(subscriberlastname);
	subscriberlastnameA.sendKeys("Painooru");
	WebElement uploadpicInsuranceA =driver.findElement(uploadpicInsurance);
	uploadpicInsuranceA.click();
	
}
public void uploadPhoto()

{
	//private WebElement uploadpicInsurance;
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 250)");
	Actions a  =new Actions(driver);
	//a.keyDown(Keys.ENTER).build().perform();
	
	System.out.println("First checking");
	waitForElement(uploadurcomputer);
	WebElement uploadurcomputerA     =driver.findElement(uploadurcomputer);
	uploadurcomputerA.click();
	System.out.println("last checking");
	WebElement insuranceCardFrontA  =driver.findElement(insuranceCardFront);
	insuranceCardFrontA.click();
	WebElement choosePhotoA         =driver.findElement(choosePhoto);
//	choosePhotoA.click();
   choosePhotoA.sendKeys("C:\\Users\\softsuave\\Pictures\\Camera Roll\\stock-vector-long-hair-dog-breeds-by-size-isolated-vector-illustration-1770903848.jpg");
	waitForElement(add);
   WebElement addA                 = driver.findElement(add);
	addA.click();
	waitForElement(insuranceCardBack);
	WebElement insuranceCardBackA    = driver.findElement(insuranceCardBack);
	insuranceCardBackA.click();
	WebElement choosephotoforbackA   = driver.findElement(choosePhotoForBack);
	choosephotoforbackA.sendKeys("C:\\Users\\softsuave\\Desktop\\45fb4458cec0849beebe464f3a4eb40f.jpg");
	waitForElement(addB);
	WebElement addBB                 = driver.findElement(addB);
	addBB.click();
	waitForElement(addButton);
	WebElement addButtonA            = driver.findElement(addButton);
	addButtonA.click();

	
}
	
	
}
