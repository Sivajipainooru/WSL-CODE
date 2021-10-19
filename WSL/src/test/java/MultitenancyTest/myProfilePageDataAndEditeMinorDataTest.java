package MultitenancyTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Multitenancy.Base;
import Multitenancy.myProfilePageDataAndEditeMinorsDara;

public class myProfilePageDataAndEditeMinorDataTest extends myProfilePageDataAndEditeMinorsDara {
	@Test
  public void baseurls() throws InterruptedException
  {
	  Base b=new Base();
	  b.LaunchingMultitenancy();
	  b.Domestic();
	  b.signInPage();
	  editeMethods("Shekhar" , "shetty", "Kasi");
	  Thread.sleep(4000);
	  editeMinorPersonData();
	  Thread.sleep(5000);
	  insurance();
	  Thread.sleep(4000);
	  uploadPhoto();
  }
 

}
