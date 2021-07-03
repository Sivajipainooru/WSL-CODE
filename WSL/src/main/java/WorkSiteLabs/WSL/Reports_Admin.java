package WorkSiteLabs.WSL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Reports_Admin extends Base{
	By allreportt  = By.xpath("html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div/button");
	By datclick   = By.xpath("//div[@class='ant-picker ant-picker-focused']");
	By alldatess  = By.xpath("//tbody/tr/td/div");
	By allcountryreports= By.xpath("//div[@class='sc-juNKJE eKFMNo']");
	By downloadareprts= By.xpath("(//div[@class='sc-gDyJWR dOZCkY']/button)[1]/span[2]");
	By downloadpositrpts =By.xpath("(//div[@class='sc-juNKJE eKFMNo'])[2]");
	By downloadnegtrpts  =By.xpath("(//div[@class='sc-juNKJE eKFMNo'])[3]");
	 
	  
	  //Select on DayWiseAppointment 
	public void reportsdmin() throws InterruptedException { 
	  List<WebElement> options=driver.findElements(By.xpath("html/body/div[2]/div[3]/div[2]/ul/a/div/div")); 
	  for (int i = 0; i <=options.size(); i++) 
	  { 
		  if(options.get(i).getText().equalsIgnoreCase("report")) 
		  {
	        options.get(i).click(); 
	        break; 
	        } 
		  
	  }
	 
	  List<WebElement> result=driver.findElements(allreportt);
	  System.out.println(result.size());
	  for(int i=0;i<=result.size();i++)
	  {
		  System.out.println("inside");
		  //System.out.println(result.get(i).getText());
//	      System.out.println(result.get(i).getText());
//	       result.get(i).click();
//	       Thread.sleep(20000);
	      if(result.get(i).getText().equals("COUNTY REPORT")) 
	      {
	    	  System.out.println("country report showing");
		      result.get(i).click(); 
		      break;

		  }
	      
	  }
	}
}
	  //try
	  //{
//	  waitForElement(downloadareprts);
//	  Thread.sleep(10000);
//	  WebElement dreports=driver.findElement(downloadareprts);
//	  dreports.click();
//	  
//	  waitForElement(downloadpositrpts);
//	WebElement dpositiverpts =driver.findElement(downloadpositrpts);
//	dpositiverpts.click();
//	driver.navigate().back();
//	waitForElement(downloadnegtrpts);
//	WebElement dnegitiverpts =driver.findElement(downloadnegtrpts);
//	dnegitiverpts.click();
//	driver.navigate().back();
	  
	 // catch(org.openqa.selenium.StaleElementReferenceException ex)
	  //{
		  
	//  }
	
	/*      else if(result.get(i).getText().equalsIgnoreCase("weekly report")) 
	      {
	    	  System.out.println("Weekly report showing");
		  result.get(i).click(); Thread.sleep(3000); 
		  } 
	      else if(result.get(i).getText().equalsIgnoreCase("Consolidation report")) 
	      {
	    	  System.out.println("Consolidation report showing");
		  result.get(i).click(); Thread.sleep(3000); 
		  }
		 
	  }
	  List<WebElement> arc=driver.findElements(allcountryreports);
	  for(int i=0;i<=arc.size();i++)
	  {
		  System.out.println("Sivaji"+arc.get(i).getText());
		  String totalcountry=arc.get(i).getText();
		  if(totalcountry.equalsIgnoreCase("Download All Report"))
				  {
			  
			  arc.get(i).click();
				  }
	  }
	  waitForElement(datclick);
	  WebElement dateclick   = driver.findElement(datclick);
	  dateclick.click();
	  WebElement dateclick1   = driver.findElement(datclick);
	  dateclick1.click();
	  List <WebElement> aldates  =driver.findElements(alldatess);
	  for(int i=0;i<=aldates.size()-1;i++)
	  {
		  String alldatees =aldates.get(i).getText();
		  System.out.println(alldatees);
		  if(alldatees.equals(21))
		  {
			  aldates.get(i).click();
			  break;
		  }
	  }*/
	  
//}





