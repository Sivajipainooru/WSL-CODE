package Multitenancy;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Spicejet extends Base{
	By departuredropdown =By.xpath("(//*[@id='custom_date_picker_id_1'])[1]");
	By dateselecting     =By.xpath("//*[@class='ui-state-default']");
	By returndropdown    =By.xpath("(//input[@class='custom_date_pic required home-date-input'])[2]");
	By returndateselecting =By.xpath("//*[@class='ui-state-default']");
	By familyfrdscheckbox  =By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends']");
	//By familyfrdtext       =By.xpath("//em[text()=' Family & Friends']");
	By passengerclick      =By.xpath("//div[@id='divpaxinfo']");
	By adult               =By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']");
	By child               =By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD']");
	By infant              =By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT']");
	By srcitizen           =By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen']");
	By armedforce          =By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense']");
	By ltcfare             =By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_LTCFare']");
	By govtemploy          =By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_GovtEmp']");
	By student             =By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Student']");
	By unaccompiniedminor  =By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_UNMR']");
	By Healthcare          =By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_HealthCareProfessional']");
	
	
	
	public void methods() throws InterruptedException
	{
		WebElement dd=driver.findElement(departuredropdown);
		dd.click();
		//waitForElement(singledate);
		//WebElement singledt=driver.findElement(singledate);
		//singledt.click();
		//Actions a=new Actions(driver);
		//a.moveToElement((WebElement) singledate).click().build().perform();
		Thread.sleep(3000);
		List<WebElement> dateselectclick=driver.findElements(dateselecting);
		for(int i=0;i<dateselectclick.size();i++)
		{
			String text=dateselectclick.get(i).getText();
			if(text.equals("20"))
			{
				dateselectclick.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		WebElement dd2=driver.findElement(returndropdown);
		dd2.click();
		Thread.sleep(1000);
		List<WebElement> returndateselectclick=driver.findElements(returndateselecting);
		for(int i=0;i<returndateselectclick.size();i++)
		{
			String text=returndateselectclick.get(i).getText();
			if(text.equals("25"))
			{
				returndateselectclick.get(i).click();
				break;
			}
		}
		Boolean familycheckbox= driver.findElement(familyfrdscheckbox).isSelected();
		if(familycheckbox==true)
		{
		}
		else
		{
			Thread.sleep(3000);
			WebElement familycheckboxA =driver.findElement(familyfrdscheckbox);
			familycheckboxA.click();
			String familytext=driver.findElement(familyfrdscheckbox).getAttribute("Family&Friends");
			System.out.println(familytext);
			
		}
		
		WebElement pasengerclick     = driver.findElement(passengerclick);
		pasengerclick.click();
		Select adultA=new Select(driver.findElement(adult));
		adultA.selectByIndex(2);
		Select childA=new Select(driver.findElement(child));
		childA.selectByIndex(2);
		Select infantA=new Select(driver.findElement(infant));
		infantA.selectByIndex(2);
		Thread.sleep(3000);
		Boolean seniorctzen=driver.findElement(srcitizen).isSelected();
	    if(seniorctzen==true)
	    {
	    	
	    }
	    else
	    {
	    	WebElement seniorcitizen=driver.findElement(srcitizen);
	    	seniorcitizen.click();
	    	seniorcitizen.getText();
	    	WebElement pasengerclickA     = driver.findElement(passengerclick);
			pasengerclickA.click();
			Select adultB=new Select(driver.findElement(adult));
			adultB.selectByIndex(2);
		
			Select infantB=new Select(driver.findElement(infant));
			infantB.selectByIndex(2);
	    }
	    Thread.sleep(3000);
	    Boolean armeedforce =driver.findElement(armedforce).isSelected();
	    if(armeedforce==true)
	    {
	    }
	    else
	    {
	    	Thread.sleep(3000);
	    	WebElement armeedforceA=driver.findElement(armedforce);
	    	armeedforceA.click();
	    	armeedforceA.getText();
	    	WebElement pasengerclickC     = driver.findElement(passengerclick);
			pasengerclickC.click();
	    	driver.switchTo().activeElement();
	    	Thread.sleep(2000);
	    	Select adultB=new Select(driver.findElement(adult));
			adultB.selectByIndex(1);
			Select childB=new Select(driver.findElement(child));
			childB.selectByIndex(3);
			Select infantB=new Select(driver.findElement(infant));
			infantB.selectByIndex(1);
	    	
	    }
	    Boolean ltcfareA = driver.findElement(ltcfare).isSelected();
	    if(ltcfareA==true)
	    {
	    	
	    }
	    else
	    {
	    	Thread.sleep(2000);
	    	WebElement ltcfareB =driver.findElement(ltcfare);
	    	ltcfareB.click();
	    	Thread.sleep(3000);
	    	WebElement pasengerclickD=driver.findElement(passengerclick);
	    	pasengerclickD.click();
	    	Select adultC=new Select(driver.findElement(adult));
			adultC.selectByIndex(2);
			Select childC=new Select(driver.findElement(child));
			childC.selectByIndex(3);
			Select infantC=new Select(driver.findElement(infant));
			infantC.selectByIndex(2);
	    	
	    }
	    Boolean govtemployA = driver.findElement(govtemploy).isSelected();
	    if(govtemployA==true)
	    {
	    	
	    }
	    else
	    {
	    	Thread.sleep(2000);
	    	WebElement govtemployB =driver.findElement(govtemploy);
	    	govtemployB.click();
	    	Thread.sleep(3000);
	    	WebElement pasengerclickE=driver.findElement(passengerclick);
	    	pasengerclickE.click();
	    	Select adultD=new Select(driver.findElement(adult));
			adultD.selectByIndex(2);
			
	    	
	    }
	    Boolean studentA = driver.findElement(student).isSelected();
	    if(studentA==true)
	    {
	    	
	    }
	    else
	    {
	    	Thread.sleep(2000);
	    	WebElement studentB =driver.findElement(student);
	    	studentB.click();
	    	Thread.sleep(3000);
	    	WebElement pasengerclickF=driver.findElement(passengerclick);
	    	pasengerclickF.click();
	    	Select adultE=new Select(driver.findElement(adult));
			adultE.selectByIndex(3);
			
	    }
	    Boolean unaccompiniedminorA = driver.findElement(unaccompiniedminor).isSelected();
	    if(unaccompiniedminorA==true)
	    {
	    
	    }
	    else
	    {
	    Thread.sleep(2000);
    	WebElement unaccompiniedminorB =driver.findElement(unaccompiniedminor);
    	unaccompiniedminorB.click();
    	Thread.sleep(3000);
    	WebElement pasengerclickG=driver.findElement(passengerclick);
    	pasengerclickG.click();
    	
		Select childF=new Select(driver.findElement(child));
		childF.selectByIndex(2);
		
	    }
		 Boolean HealthcareA = driver.findElement(Healthcare).isSelected();
		 if(HealthcareA==true)
		 {
		    
		 }
		 else
		 {
			    Thread.sleep(3000);
			    driver.switchTo().activeElement();
		    	WebElement HealthcareB =driver.findElement(Healthcare);
		    	HealthcareB.click();
		    	Thread.sleep(3000);
		    	WebElement pasengerclickH=driver.findElement(passengerclick);
		    	pasengerclickH.click();
		    	Select adultG=new Select(driver.findElement(adult));
		    	adultG.selectByIndex(1);
				Select childG=new Select(driver.findElement(child));
				childG.selectByIndex(2);
				Select infantG=new Select(driver.findElement(infant));
				infantG.selectByIndex(1);
				//WebElement testingdata=driver.findElement(by)
		    	
		 }
				
		
	  
	}

}
