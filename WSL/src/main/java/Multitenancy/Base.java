package Multitenancy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	By dropdown              =  By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]");
	By domestically          =  By.xpath("//div[text()='Domestically']");
	By destinationdropdown   =  By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[2]");
	By allDestinationStates  =  By.xpath("//div[@class=' css-11unzgr']/*");
	By flyingdropdown        =  By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[3]");
	By allFlyingStates       =  By.xpath("//div[@class=' css-11unzgr']/*");
	By checkbox              =  By.xpath("//input[@type='checkbox']");
	By proceed               =  By.xpath("//button[text()='Proceed Now']");
	public void LaunchingMultitenancy()
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wsl-multitenancy-dev-ac13b.web.app");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	//Are you traveling internationally or domestically?
	public void Domestic() throws InterruptedException
	{
      WebElement dropdown1        = driver.findElement(dropdown);
      dropdown1.click();
      WebElement domestically1    = driver.findElement(domestically);
      domestically1.click();
      //What is your destination state? *
      WebElement destinationDropDown=driver.findElement(destinationdropdown);
      destinationDropDown.click();
      Thread.sleep(60000);
      List<WebElement> alldestinationstates1=driver.findElements(allDestinationStates);
      for(int i=0;i<alldestinationstates1.size()-1;i++)
      {
    	  if(alldestinationstates1.get(i).getText().equals("California"))
    	  {
    		  alldestinationstates1.get(i).click();
    		  break;
    	  }
    	  
      }
     // What airline are you flying on? *
      WebElement flyingdropdown1     = driver.findElement(flyingdropdown);
      flyingdropdown1.click();
      List<WebElement> allFlyingStates1 = driver.findElements(allFlyingStates);
      for(int i=0;i<allFlyingStates1.size()-1;i++)
      {
    	  if(allFlyingStates1.get(i).getText().equals("Air India"))
    	  {
    		  allFlyingStates1.get(i).click();
    		  break;
    	  }
    	  
      }
      WebElement checkbox1            = driver.findElement(checkbox);
      checkbox1.click();
      WebElement proceedNow           = driver.findElement(proceed);
      proceedNow.click();
      
      


      
    }

}
