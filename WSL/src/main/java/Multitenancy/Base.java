package Multitenancy;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver;
	By dropdown              =  By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]");
	By domestically          =  By.xpath("//div[text()='Domestically']");
	/*By destinationdropdown   =  By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/p[2]/form/div[2]/div[2]/div[1]/div/div[2]/div");
	By State                 =  By.xpath("//*[@id='react-select-5-option-5']");
	By allDestinationStates2 =  By.xpath("//div[@class=' css-11unzgr']/*");
	By allDestinationStates = By.xpath("//*[text()='What is your destination state? ']/following::div[6]");*/
	By flyingdropdown        =  By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/p[2]/form/div[3]/div[2]/div[1]/div/div[2]/div");
	By allFlyingStates       =  By.xpath("//div[@class=' css-11unzgr']/*");
	By checkbox              =  By.xpath("//input[@type='checkbox']");
	By proceed               =  By.xpath("//button[text()='Proceed Now']");
	By EmailId               =  By.xpath("//input[@name='email']");
	By Password              =  By.xpath("//input[@placeholder='Password']");
	By SignIn                =  By.xpath("//button[@type='submit']");
	public void email()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
	}
	public void viruj()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.virujh.com/");
	}
	public void ValidationMsg()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/session");
	}
	public void Spicejetd()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/search.aspx");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void googlepagescreenshot()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
	}
	public void LaunchingMultitenancy()
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softsuave\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wsl-multitenancy-dev-ac13b.web.app");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	//Are you traveling internationally or domestically?
	public void Domestic() throws InterruptedException
	{
     waitForElement(dropdown);
      WebElement dropdown1        = driver.findElement(dropdown);
      dropdown1.click();
      WebElement domestically1    = driver.findElement(domestically);
     
      domestically1.click();
      //Thread.sleep(6000);
      //What is your destination state? *
     // driver.switchTo().frame(1);
      //WE UNABLE TO FINDOUT SOLUTION WE WILL CHECK LATER
   /*  WebElement destinationDropDowns=driver.findElement(destinationdropdown);
      System.out.println("Test");
      destinationDropDowns.click();
      Thread.sleep(10000);
      WebElement state1            = driver.findElement(State);
      System.out.println("State test");
      state1.click();
      
     List<WebElement> alldestinationstates1=driver.findElements(allDestinationStates);
      System.out.println(alldestinationstates1.size());
      for(int i=0;i<alldestinationstates1.size()-1;i++)
      {
    	  if(alldestinationstates1.get(i).getText().equals("California"))
    	  {
    		  System.out.println("Test1");
    		  alldestinationstates1.get(i).click();
    		  break;
    	  }
    	  
      }  */
     // What airline are you flying on? *
      Thread.sleep(6000);
      WebElement flyingdropdown1     = driver.findElement(flyingdropdown);
      flyingdropdown1.click();
      List<WebElement> allFlyingStates1 = driver.findElements(allFlyingStates);
      for(int i=0;i<allFlyingStates1.size()-1;i++)
      {
    	  if(allFlyingStates1.get(i).getText().equals("Air India"))
    	  {
    		  System.out.println("Test trail");
    		  allFlyingStates1.get(i).click();
    		  break;
    	  }
    	  
      }
      WebElement checkbox1            = driver.findElement(checkbox);
      checkbox1.click();
      waitForElement(proceed);
      WebElement proceedNow           = driver.findElement(proceed);
      proceedNow.click();
      
     }
	public void signInPage()
	{
		WebElement emailUserName    = driver.findElement(EmailId);
        emailUserName.sendKeys("indhu@worksitelabs.com");
        WebElement  passwordfield  = driver.findElement(Password);
        passwordfield.sendKeys("Test@123");
        WebElement signinbutton    =driver.findElement(SignIn);
        signinbutton.click();
	}
	public void waitForElement(By locator)
	{
	  WebDriverWait wait   = new WebDriverWait(driver,99);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	
}
